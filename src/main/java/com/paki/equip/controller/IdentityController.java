package com.paki.equip.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.paki.equip.pojo.Equbuy;
import com.paki.equip.pojo.EqubuyExample;
import com.paki.equip.pojo.Useraccount;
import com.paki.equip.pojo.UseraccountExample;
import com.paki.equip.service.EqubuyService;
import com.paki.equip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/ident")
public class IdentityController {

    @Autowired
    UserService userService;
    @Autowired
    EqubuyService equbuyService;

    @PostMapping("/login")
    public ModelAndView doLogin(Useraccount useraccount, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        Useraccount user = userService.selectByaccount(useraccount);


        if(user!=null){
            request.getSession().setAttribute("login",user);
            PageHelper.startPage(1,5);
            List<Equbuy> equbuyList = equbuyService.selectByExample(new EqubuyExample());
            PageInfo pageInfo = new PageInfo(equbuyList);

            modelAndView.setViewName("index");
            modelAndView.addObject("pageInfo",pageInfo);
            return modelAndView;
        }
        modelAndView.setViewName("redirect:/index.jsp");
        return modelAndView;
    }

    @PostMapping("/findpass")
    public String findPass(Useraccount useraccount, UseraccountExample example, HttpSession httpSession){



        example.createCriteria().andUseridEqualTo(useraccount.getUserid());

        int i = userService.updateByExampleSelective(useraccount, example);

        if(i>0){
            httpSession.removeAttribute("login");
            return "redirect:/login.jsp";
        }
        return "redirect:/forget.jsp";
    }

    String formattime(Date date){

        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String renttime = df.format(date);
        return renttime;
    }

    @PostMapping("/regist")
    public String  regist(Useraccount useraccount, HttpServletRequest request){

        String username = useraccount.getUsername();
        Useraccount user = null;
        boolean flag = false;
        user = userService.selectByname(useraccount);
        if(user==null){
            useraccount.setDepartid(1);
            userService.insert(useraccount);
            return "redirect:/login.jsp";
        }
        request.getSession().setAttribute("flag",false);
        return "redirect:/reg.jsp";
    }
}
