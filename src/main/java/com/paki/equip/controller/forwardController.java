package com.paki.equip.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.paki.equip.pojo.*;
import com.paki.equip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/forward")
public class forwardController {

    @Autowired
    UserService userService;
    @Autowired
    EqubuyService equbuyService;
    @Autowired
    RentService rentService;
    @Autowired
    RepairService repairService;
    @Autowired
    DamageService damageService;

    @GetMapping("/homeForward")
    public ModelAndView homeForward(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();

        if(httpSession.getAttribute("login")==null){
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }

        if(httpSession.getAttribute("login")!=null){
            PageHelper.startPage(1,5);
            List<Equbuy> equbuyList = equbuyService.selectByExample(new EqubuyExample());
            PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuyList);
            modelAndView.setViewName("index");
            modelAndView.addObject("pageInfo",pageInfo);
        }
        return modelAndView;
    }

    @GetMapping("/exitForward")
    public String exitForward(HttpServletRequest request){
        request.getSession().removeAttribute("login");
        return "redirect:/login.jsp";
    }

    @GetMapping("/userForward")
    public ModelAndView userForward(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        if(httpSession.getAttribute("login")==null){
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }
        PageHelper.startPage(1,5);
        List<Useraccount> users = userService.selectByExample(new UseraccountExample());
        PageInfo<Useraccount> pageInfo = new PageInfo<>(users);

        modelAndView.setViewName("user");
        modelAndView.addObject("pageInfo",pageInfo);
        return modelAndView;
    }

    @GetMapping("/messageForward")
    public String messageForward(HttpSession httpSession){
        if(httpSession.getAttribute("login")==null){
            return "redirect:/login.jsp";
        }
        return "message";
    }

    @GetMapping("/forgetForward")
    public String forgetForward(HttpSession httpSession){
        if(httpSession.getAttribute("login")==null){
            return "redirect:/login.jsp";
        }
        return "redirect:/forget.jsp";
    }

    @GetMapping("/addequbForward")
    public String addequbForward(HttpSession httpSession){
        if(httpSession.getAttribute("login")==null){
            return "redirect:/login.jsp";
        }
        return "addequb";
    }

    @GetMapping("/adduserForward")
    public String adduserForward(HttpSession httpSession){
        if(httpSession.getAttribute("login")==null){
            return "redirect:/login.jsp";
        }
        return "adduser";
    }

    @GetMapping("/toeditequb/{equid}")
    public ModelAndView toeditequb(@PathVariable Integer equid,HttpSession httpSession){

        ModelAndView modelAndView = new ModelAndView();
        if(httpSession.getAttribute("login")==null){
            modelAndView.setViewName( "redirect:/login.jsp");
            return modelAndView;
        }

        Equbuy equbuy = equbuyService.selectByPrimaryKey(equid);
        modelAndView.setViewName("editequb");
        modelAndView.addObject("equbs",equbuy);
        return modelAndView;
    }

    @GetMapping("/toEdituserForward/{id}")
    public ModelAndView toEdituserForward(@PathVariable Integer id,HttpSession httpSession){

        ModelAndView modelAndView = new ModelAndView();
        if(httpSession.getAttribute("login")==null){
            modelAndView.setViewName( "redirect:/login.jsp");
            return modelAndView;
        }
        Useraccount user = userService.selectByPrimaryKey(id);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("edituser");
        return modelAndView;
    }

    @RequestMapping("/toRentman")
    public String toRentman(Model model,HttpSession httpSession){
        if(httpSession.getAttribute("login")==null){
            return "redirect:/login.jsp";
        }
        PageHelper.startPage(1,5);
        List<Rent> rents = rentService.selectByExample(new RentExample());
        PageInfo<Rent> pageInfo = new PageInfo<>(rents);

        model.addAttribute("pageInfo",pageInfo);

        return "rentman";
    }

    @RequestMapping("/tomainabout")
    public String tomainabout(HttpSession httpSession){
        if(httpSession.getAttribute("login")==null){
            return "redirect:/login.jsp";
        }
        return "mainbout";
    }

    @RequestMapping("/toRepair")
    public String toRepair(Model model, HttpSession httpSession){
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if(httpSession.getAttribute("login")==null){
            return "redirect:/login.jsp";
        }

        PageHelper.startPage(1,5);
        List<Repair> repairs = repairService.selectByExample(new RepairExample());
        PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
        model.addAttribute("pageInfo",pageInfo);

        return "repair";

    }

    @RequestMapping("/toDamage")
    public String toDamage(HttpSession httpSession,Model model){
        if(httpSession.getAttribute("login")==null){
            return "redirect:/login.jsp";
        }

        PageHelper.startPage(1,5);
        List<Damage> damages = damageService.selectByExample(new DamageExample());
        PageInfo<Damage> pageInfo = new PageInfo<>(damages);

        model.addAttribute("pageInfo",pageInfo);
        return "damage";
    }
}
