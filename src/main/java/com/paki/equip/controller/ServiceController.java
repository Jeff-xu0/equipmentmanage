package com.paki.equip.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.paki.equip.pojo.*;
import com.paki.equip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    EqubuyService equbuyService;
    @Autowired
    UserService userService;
    @Autowired
    RentService rentService;
    @Autowired
    RepairService repairService;
    @Autowired
    DamageService damageService;

    @GetMapping("/equPagejump")
    public ModelAndView equPagejump(@RequestParam(value = "pn", defaultValue = "1") Integer pn, HttpSession httpSession) {

        ModelAndView modelAndView = new ModelAndView();
        if (httpSession.getAttribute("login") == null) {
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }

        PageHelper.startPage(pn, 5);
        List<Equbuy> list = equbuyService.selectByExample(new EqubuyExample());
        PageInfo<Equbuy> pageInfo = new PageInfo<>(list);

        modelAndView.setViewName("index");
        modelAndView.addObject("pageInfo", pageInfo);
        return modelAndView;

    }

    @GetMapping("/userPageJump")
    public ModelAndView userPageJump(@RequestParam(value = "pn", defaultValue = "1") Integer pn, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        if (httpSession.getAttribute("login") == null) {
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }

        PageHelper.startPage(pn, 5);
        List<Useraccount> users = userService.selectByExample(new UseraccountExample());
        PageInfo<Useraccount> pageInfo = new PageInfo<>(users);

        modelAndView.setViewName("user");
        modelAndView.addObject("pageInfo", pageInfo);
        return modelAndView;
    }

    @RequestMapping(value = "/updatequb", method = RequestMethod.POST)
    public ModelAndView updateequb(Equbuy equbuy, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        if (httpSession.getAttribute("login") == null) {
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }

        EqubuyExample example = new EqubuyExample();
        Map<String, Object> hashMap = new HashMap<>();
        example.createCriteria().andEquidEqualTo(equbuy.getEquid());
        int i = 0;
        try {
            i = equbuyService.updateByExampleSelective(equbuy, example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i > 0) {
            PageHelper.startPage(1, 5);
            List<Equbuy> equbuys = equbuyService.selectByExample(new EqubuyExample());
            PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
            modelAndView.addObject("pageInfo", pageInfo);
            modelAndView.setViewName("index");
            return modelAndView;
        } else {
            modelAndView.addObject("error", true);
            Equbuy equbuyy = equbuyService.selectByPrimaryKey(equbuy.getEquid());
            hashMap.put("error", true);
            hashMap.put("equbs", equbuyy);
            modelAndView.addAllObjects(hashMap);
            modelAndView.setViewName("editequb");
        }

        return modelAndView;
    }

    @GetMapping("/deletequip/{id}")
    public ModelAndView deletequip(@PathVariable Integer id, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        if (httpSession.getAttribute("login") == null) {
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }

        int i = 0;
        boolean flag = false;
        Map<String, Object> hashMap = new HashMap<>();
        try {
            i = equbuyService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i < 0) {
            flag = true;
        }
        PageHelper.startPage(1, 5);
        List<Equbuy> equbuys = equbuyService.selectByExample(new EqubuyExample());
        PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
        hashMap.put("pageInfo", pageInfo);
        hashMap.put("flag", flag);
        modelAndView.addAllObjects(hashMap);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/deleteUser/{id}")
    public ModelAndView deleteUser(@PathVariable Integer id, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        if (httpSession.getAttribute("login") == null) {
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }

        int i = 0;
        Map<String, Object> hashMap = new HashMap<>();
        boolean flag = false;
        try {
            i = userService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i < 0) {
            flag = true;
        }
        PageHelper.startPage(1, 5);
        List<Useraccount> users = userService.selectByExample(new UseraccountExample());
        PageInfo<Useraccount> pageInfo = new PageInfo<>(users);
        hashMap.put("pageInfo", pageInfo);
        hashMap.put("flag", flag);
        modelAndView.addAllObjects(hashMap);
        if (flag) {
            modelAndView.setViewName("edituser");
        } else {
            modelAndView.setViewName("user");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/updateuser", method = RequestMethod.POST)
    public ModelAndView updatequb(Useraccount useraccount, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        if (httpSession.getAttribute("login") == null) {
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }

        UseraccountExample example = new UseraccountExample();
        Map<String, Object> hashMap = new HashMap<>();
        boolean flag = false;
        example.createCriteria().andUseridEqualTo(useraccount.getUserid());
        System.out.println("------------------------------------------------------");
        System.out.println(useraccount.getDepartid());
        System.out.println("------------------------------------------------------");
        int i = 0;
        try {
            i = userService.updateByExampleSelective(useraccount, example);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (i < 0) {
            flag = true;
            Useraccount user = userService.selectByPrimaryKey(useraccount.getUserid());
            hashMap.put("user", user);
            hashMap.put("flag", flag);
            modelAndView.addAllObjects(hashMap);
            modelAndView.setViewName("edituser");
            return modelAndView;
        }
        PageHelper.startPage(1, 5);
        List<Useraccount> users = userService.selectByExample(new UseraccountExample());
        PageInfo<Useraccount> pageInfo = new PageInfo<>(users);
        modelAndView.addObject("pageInfo", pageInfo);
        modelAndView.setViewName("user");
        return modelAndView;
    }

    @GetMapping("/rentEquip/{equid}")
    public ModelAndView rentEquip(@PathVariable Integer equid, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        if (httpSession.getAttribute("login") == null) {
            modelAndView.setViewName("redirect:/login.jsp");
            return modelAndView;
        }

        UseraccountExample example = new UseraccountExample();
        EqubuyExample equbuyExample = new EqubuyExample();

        Equbuy equbuy = equbuyService.selectByPrimaryKey(equid);
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if(user.getEquid()!=null){
            PageHelper.startPage(1, 5);
            List<Equbuy> equbuys = equbuyService.selectByExample(new EqubuyExample());
            PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);

            modelAndView.setViewName("index");
            modelAndView.addObject("pageInfo", pageInfo);
            modelAndView.addObject("error","请归还已借设备后继续操作！");
            return modelAndView;
        }

        Integer userid = user.getUserid();

        equbuyExample.createCriteria().andEquidEqualTo(equid);
        example.createCriteria().andUseridEqualTo(userid);


//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        //System.out.println("当前日期:"+sf.format(c.getTime()));
        c.add(Calendar.DAY_OF_MONTH, 10);
        //System.out.println("增加一天后日期:"+sf.format(c.getTime()));
        user.setPrebacktime(c.getTime());
        System.out.println("------------------------------------------------------");
        System.out.println(user.getUserid());
        System.out.println(user.getEquid());
        System.out.println("------------------------------------------------------");
        if (user.getEquid() == null) {
            if (equbuy.getAmount() > 0) {
                user.setEquid(equid);
                equbuy.setAmount(equbuy.getAmount() - 1);
                userService.updateByExampleSelective(user, example);
                equbuyService.updateByExampleSelective(equbuy, equbuyExample);
                Rent rent = new Rent();
                rent.setRentdepid(user.getDepartid());
                rent.setRentmanid(userid);
                rent.setReturntime(c.getTime());
                rentService.insert(rent);
            } else {
                modelAndView.addObject("error", "存量不足，借阅失败");
            }
        } else {
            modelAndView.addObject("error", "仓库已持有该/其他设备");
        }

        PageHelper.startPage(1, 5);
        List<Equbuy> equbuys = equbuyService.selectByExample(new EqubuyExample());
        PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);

        modelAndView.setViewName("index");
        modelAndView.addObject("pageInfo", pageInfo);
        return modelAndView;
    }

    @RequestMapping("/returnEquip/{equid}")
    public String returnEquip(@PathVariable Integer equid, Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        EqubuyExample equbuyExample = new EqubuyExample();

        Equbuy equbuy = equbuyService.selectByPrimaryKey(equid);
        if (user.getEquid() != null) {
            if (user.getEquid().equals(equid)) {
                user.setEquid(null);
                user.setPrebacktime(null);
                equbuy.setAmount(equbuy.getAmount() + 1);

                try {
                    rentService.clearRent(user.getUserid());
                    userService.returnEquip(user.getUserid());
                    equbuyExample.createCriteria().andEquidEqualTo(equid);
                    equbuyService.updateByExampleSelective(equbuy, equbuyExample);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                model.addAttribute("error", "设备编号不同，请核对后再选择");
            }
        } else {
            model.addAttribute("error", "你没有借任何设备！");
        }


        PageHelper.startPage(1, 5);
        List<Equbuy> equbuys = null;
        try {
            equbuys = equbuyService.selectByExample(new EqubuyExample());
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);

        model.addAttribute("pageInfo", pageInfo);
        return "index";
    }

    @GetMapping("/rentPageJump")
    public String rentPageJump(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        PageHelper.startPage(pn, 5);
        List<Rent> rents = rentService.selectByExample(new RentExample());
        PageInfo<Rent> pageInfo = new PageInfo<>(rents);

        model.addAttribute("pageInfo", pageInfo);
        return "rentman";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(Useraccount useraccount, Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        int i = 0;
        try {
            i = userService.insert(useraccount);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (i < 0) {
            model.addAttribute("error", "添加失败，请返回或重试！");
            return "addUser";
        } else {
            PageHelper.startPage(1, 5);
            List<Useraccount> users = userService.selectByExample(new UseraccountExample());
            PageInfo<Useraccount> pageInfo = new PageInfo<>(users);

            model.addAttribute("pageInfo", pageInfo);
        }
        return "user";
    }

    @RequestMapping("/addEquip")
    public String addEquip(Equbuy equbuy, Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        int i = 0;
        Calendar c = Calendar.getInstance();
        //System.out.println("当前日期:"+sf.format(c.getTime()));
//        c.add(Calendar.DAY_OF_MONTH, 10);
        //System.out.println("增加一天后日期:"+sf.format(c.getTime()));

        equbuy.setBuytime(c.getTime());
        System.out.println("----------------------------------------------------------");
        System.out.println(c.getTime());
        System.out.println("----------------------------------------------------------");
        try {
            i = equbuyService.insert(equbuy);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (i < 0) {
            model.addAttribute("error", "添加失败，请返回或重试！");
            return "addUser";
        } else {
            PageHelper.startPage(1, 5);
            List<Equbuy> equbuys = equbuyService.selectByExample(new EqubuyExample());
            PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);

            model.addAttribute("pageInfo", pageInfo);
        }
        return "index";
    }

    @RequestMapping("/usermanage/{userid}")
    public String usermanage(@PathVariable Integer userid, Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        Useraccount user = userService.selectByPrimaryKey(userid);
        model.addAttribute("user", user);

        return "edituser";
    }

    @RequestMapping("/addrepair")
    public String addrepair(@RequestParam(value = "reson") String reson, @RequestParam(value = "equid") Integer equid, Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        List<Equbuy> equbuys = null;
        Repair repair = new Repair();
        repair.setEquid(equid);
        repair.setReason(reson);

        try {
            Equbuy equbuy = equbuyService.selectByPrimaryKey(equid);
            if (equbuy == null) {
                PageHelper.startPage(1, 5);
                equbuys = equbuyService.selectByExample(new EqubuyExample());
                PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
                model.addAttribute("pageInfo", pageInfo);
                model.addAttribute("error", "没有该设备喔~");
                return "index";
            }
            if (equbuy.getAmount() == 0) {
                PageHelper.startPage(1, 5);
                equbuys = equbuyService.selectByExample(new EqubuyExample());
                PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
                model.addAttribute("pageInfo", pageInfo);
                model.addAttribute("error", "设备数量已借出或维修 无法报修！~");
                return "index";
            }
            repairService.insertSelective(repair);
            equbuy.setAmount(equbuy.getAmount() - 1);
            EqubuyExample equbuyExample = new EqubuyExample();
            equbuyExample.createCriteria().andEquidEqualTo(equid);
            equbuyService.updateByExampleSelective(equbuy, equbuyExample);

        } catch (Exception e) {
            PageHelper.startPage(1, 5);
            equbuys = equbuyService.selectByExample(new EqubuyExample());
            PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
            model.addAttribute("pageInfo", pageInfo);
            e.printStackTrace();

            model.addAttribute("error", "报修失败！");
            return "index";
        }
        PageHelper.startPage(1, 5);
        List<Repair> repairs = repairService.selectByExample(new RepairExample());
        PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
        model.addAttribute("pageInfo", pageInfo);

        return "repair";
    }

    @RequestMapping("/repairPageJump")
    public String repairPageJump(@RequestParam(value = "pn", defaultValue = "1") Integer pn, HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        PageHelper.startPage(pn, 5);
        List<Repair> repairs = repairService.selectByExample(new RepairExample());
        PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
        model.addAttribute("pageInfo", pageInfo);

        return "repair";
    }

    @RequestMapping("/receiveequip/{repairid}")
    public String receiveequip(@PathVariable Integer repairid, HttpSession httpSession, Model model) {
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if (user == null) {
            return "redirect:/login.jsp";
        }
        Repair repair = new Repair();
        Date date = new Date();
        repair.setRepairmanid(user.getUserid());
        repair.setRepairtime(date);
        RepairExample repairExample = new RepairExample();
        repairExample.createCriteria().andRepairidEqualTo(repairid);
        repairService.updateByExampleSelective(repair, repairExample);

        PageHelper.startPage(1, 5);
        List<Repair> repairs = repairService.selectByExample(new RepairExample());
        PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
        model.addAttribute("pageInfo", pageInfo);
        return "repair";
    }

    @RequestMapping("/repairsuccess/{repairid}")
    public String repairsuccess(@PathVariable Integer repairid, HttpSession httpSession, Model model) {
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if (user == null) {
            return "redirect:/login.jsp";
        }
        Repair repair = repairService.selectByPrimaryKey(repairid);
        if (repair.getRepairmanid().equals(user.getUserid())) {
            Repair repairreturn = new Repair();
            repairreturn.setResult(true);
            RepairExample repairExample = new RepairExample();
            repairExample.createCriteria().andRepairidEqualTo(repairid);
            repairService.updateByExampleSelective(repairreturn, repairExample);
        } else {
            model.addAttribute("error", "你没有接手该设备维修！");
        }

        PageHelper.startPage(1, 5);
        List<Repair> repairs = repairService.selectByExample(new RepairExample());
        PageInfo<Repair> PageInfo = new PageInfo<>(repairs);
        model.addAttribute("pageInfo", PageInfo);
        return "repair";
    }

    @RequestMapping("/repairfail/{repairid}")
    public String repairfail(@PathVariable Integer repairid, HttpSession httpSession, Model model) {
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if (user == null) {
            return "redirect:/login.jsp";
        }
        Repair repair = repairService.selectByPrimaryKey(repairid);
        if (repair.getRepairmanid().equals(user.getUserid())) {
            repair.setResult(false);
            RepairExample repairExample = new RepairExample();
            repairExample.createCriteria().andRepairidEqualTo(repairid);
            repairService.updateByExampleSelective(repair, repairExample);
        } else {
            model.addAttribute("error", "你没有接手该设备维修！");
        }

        PageHelper.startPage(1, 5);
        List<Repair> repairs = repairService.selectByExample(new RepairExample());
        PageInfo<Repair> PageInfo = new PageInfo<>(repairs);
        model.addAttribute("pageInfo", PageInfo);
        return "repair";
    }

    @RequestMapping("/adddamage")
    public String adddamage(@RequestParam Integer repairid,
                            @RequestParam String reson,
                            @RequestParam String way,
                            HttpSession httpSession, Model model) {
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if (user == null) {
            return "redirect:/login.jsp";
        }

        Repair repair = repairService.selectByPrimaryKey(repairid);
        if (repair == null) {
            PageHelper.startPage(1, 5);
            List<Repair> repairs = repairService.selectByExample(new RepairExample());
            PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
            model.addAttribute("pageInfo", pageInfo);
            model.addAttribute("error", "单号不存在");
            return "repair";
        }
        Boolean result = repair.getResult();
        if (!result) {
            Integer handleman = repair.getRepairmanid();
            Damage damage = new Damage();
            damage.setAgreeman(user.getUserid());
            damage.setHandleman(handleman);
            damage.setReason(reson);
            damage.setEquid(repair.getEquid());
            damage.setWay(way);
            damageService.insert(damage);
            repairService.deleteByPrimaryKey(repairid);
            equbuyService.deleteByPrimaryKey(repair.getEquid());
        } else {
            model.addAttribute("error", "该设备修复良好！请投入使用");
        }

        PageHelper.startPage(1, 5);
        List<Repair> repairs = repairService.selectByExample(new RepairExample());
        PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
        model.addAttribute("pageInfo", pageInfo);

        return "repair";
    }

    @RequestMapping("/backequbuy/{repairid}")
    public String backequbuy(@PathVariable Integer repairid, HttpSession httpSession, Model model) {
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if (user == null) {
            return "redirect:/login.jsp";
        }

        Repair repair = repairService.selectByPrimaryKey(repairid);
        if (repair.getResult()) {
            Equbuy equbuy = equbuyService.selectByPrimaryKey(repair.getEquid());
            equbuy.setAmount(equbuy.getAmount() + 1);
            EqubuyExample equbuyExample = new EqubuyExample();
            equbuyExample.createCriteria().andEquidEqualTo(equbuy.getEquid());
            equbuyService.updateByExampleSelective(equbuy, equbuyExample);
            repairService.deleteByPrimaryKey(repairid);
        }

        PageHelper.startPage(1, 5);
        List<Repair> repairs = repairService.selectByExample(new RepairExample());
        PageInfo<Repair> pageInfo = new PageInfo<>(repairs);

        model.addAttribute("pageInfo", pageInfo);
        return "repair";
    }

    @RequestMapping("/selectequ")
    public String selectequ(@RequestParam String selective, @RequestParam String keywords, HttpSession httpSession, Model model) {
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if (user == null) {
            return "redirect:/login.jsp";
        }
        Integer equid = null;
        if (selective.equals("equid")) {
            if (keywords != null) {
                try {
                    equid = Integer.valueOf(keywords.trim());
                } catch (Exception e) {
                    e.printStackTrace();
                    PageHelper.startPage(1, 5);
                    List<Equbuy> equbuys = equbuyService.selectByExample(new EqubuyExample());
                    PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
                    model.addAttribute("pageInfo", pageInfo);
                    model.addAttribute("error", "请输入相对应的关键字");

                    return "index";
                }
                PageHelper.startPage(1, 5);
                Equbuy equbuy = equbuyService.selectByPrimaryKey(equid);
                if (equbuy == null) {
                    PageHelper.startPage(1, 5);
                    List<Equbuy> equbuys = equbuyService.selectByExample(new EqubuyExample());
                    PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
                    model.addAttribute("pageInfo", pageInfo);
                    model.addAttribute("error", "该设备不存在");

                    return "index";
                }
                List<Equbuy> equbuys = new ArrayList<>();
                equbuys.add(equbuy);
                PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
                model.addAttribute("pageInfo", pageInfo);

            }
        } else {
            PageHelper.startPage(1, 5);
            EqubuyExample equbuyExample = new EqubuyExample();
            equbuyExample.createCriteria().andEuqnameEqualTo(keywords.trim());
            List<Equbuy> equbuys = equbuyService.selectByExample(equbuyExample);
            if (equbuys == null) {
                PageHelper.startPage(1, 5);
                List<Equbuy> equbuys1 = equbuyService.selectByExample(new EqubuyExample());
                PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys1);
                model.addAttribute("pageInfo", pageInfo);
                model.addAttribute("error", "该设备不存在");

                return "index";
            }
            PageInfo<Equbuy> pageInfo = new PageInfo<>(equbuys);
            model.addAttribute("pageInfo", pageInfo);
        }

        return "index";
    }

    @RequestMapping("/selectiveuser")
    public String selectiveuser(@RequestParam String selective, @RequestParam String keywords, HttpSession httpSession, Model model) {
        Useraccount user = (Useraccount) httpSession.getAttribute("login");
        if (user == null) {
            return "redirect:/login.jsp";
        }
        Integer userid = null;
        if (selective.equals("userid")) {
            if (keywords != null) {
                try {
                    userid = Integer.valueOf(keywords.trim());
                } catch (Exception e) {
                    e.printStackTrace();
                    PageHelper.startPage(1, 5);
                    List<Useraccount> users = userService.selectByExample(new UseraccountExample());
                    PageInfo<Useraccount> pageInfo = new PageInfo<>(users);
                    model.addAttribute("pageInfo", pageInfo);
                    model.addAttribute("error", "请输入相对应的关键字");

                    return "user";
                }
                PageHelper.startPage(1, 5);
                Useraccount useraccount = userService.selectByPrimaryKey(userid);
                if (useraccount == null) {
                    PageHelper.startPage(1, 5);
                    List<Useraccount> users = userService.selectByExample(new UseraccountExample());
                    PageInfo<Useraccount> pageInfo = new PageInfo<>(users);
                    model.addAttribute("pageInfo", pageInfo);
                    model.addAttribute("error", "该用户不存在");

                    return "user";
                }
                List<Useraccount> users = new ArrayList<>();
                users.add(useraccount);
                PageInfo<Useraccount> pageInfo = new PageInfo<>(users);
                model.addAttribute("pageInfo", pageInfo);

            }
        } else {
            PageHelper.startPage(1, 5);
            UseraccountExample useraccountExample = new UseraccountExample();
            useraccountExample.createCriteria().andUsernameEqualTo(keywords.trim());
            List<Useraccount> users = userService.selectByExample(useraccountExample);
            if (users == null) {
                PageHelper.startPage(1, 5);
                List<Useraccount> useraccounts = userService.selectByExample(new UseraccountExample());
                PageInfo<Useraccount> pageInfo = new PageInfo<>(useraccounts);
                model.addAttribute("pageInfo", pageInfo);
                model.addAttribute("error", "该设备不存在");

                return "user";
            }
            PageInfo<Useraccount> pageInfo = new PageInfo<>(users);
            model.addAttribute("pageInfo", pageInfo);
        }

        return "user";
    }

    @RequestMapping("/selectrepair")
    public String selectrepair(@RequestParam String selective,@RequestParam String keywords, HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        if (keywords != null) {
            Integer id = Integer.valueOf(keywords);
            if (selective.equals("repairid")) {

                PageHelper.startPage(1, 5);
                Repair repair = repairService.selectByPrimaryKey(id);
                if(repair==null){
                    PageHelper.startPage(1,5);
                    List<Repair> repairs = repairService.selectByExample(new RepairExample());
                    PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
                    model.addAttribute("pageInfo",pageInfo);
                    model.addAttribute("error","该设备不存在");
                    return "repair";
                }
                List<Repair> repairs = new ArrayList<>();
                repairs.add(repair);
                PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
                model.addAttribute("pageInfo", pageInfo);


            }else {
                RepairExample repairExample = new RepairExample();
                repairExample.createCriteria().andEquidEqualTo(id);
                PageHelper.startPage(1,100);
                List<Repair> repairs = repairService.selectByExample(repairExample);
                if(repairs==null){
                    PageHelper.startPage(1,5);
                    List<Repair> repairs1 = repairService.selectByExample(new RepairExample());
                    PageInfo<Repair> pageInfo = new PageInfo<>(repairs1);
                    model.addAttribute("pageInfo",pageInfo);
                    model.addAttribute("error","该设备不存在");
                    return "repair";
                }
                PageInfo<Repair> pageInfo = new PageInfo<>(repairs);
                model.addAttribute("pageInfo",pageInfo);

            }
        }
        return "repair";
    }

    @RequestMapping("/selectiverent")
    public String selectiverent(@RequestParam String selective,@RequestParam String keywords,HttpSession httpSession,Model model){
        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        if(selective!=null){
            Integer id = Integer.valueOf(keywords);
            if(selective.equals("rentdepartid")){
                RentExample rentExample = new RentExample();
                rentExample.createCriteria().andRentdepidEqualTo(id);
                PageHelper.startPage(1,100);
                List<Rent> rents = rentService.selectByExample(rentExample);
                if(rents==null){
                    PageHelper.startPage(1,5);
                    List<Rent> rents1 = rentService.selectByExample(new RentExample());
                    PageInfo<Rent> pageInfo = new PageInfo<>(rents1);
                    model.addAttribute("pageInfo",pageInfo);
                    model.addAttribute("error","该记录不存在");
                    return "rentman";
                }
                PageInfo<Rent> pageInfo = new PageInfo<>(rents);
                model.addAttribute("pageInfo",pageInfo);

            }else{
                RentExample rentExample = new RentExample();
                rentExample.createCriteria().andRentmanidEqualTo(id);
                PageHelper.startPage(1,100);
                List<Rent> rents = rentService.selectByExample(rentExample);
                if(rents==null){
                    PageHelper.startPage(1,5);
                    List<Rent> rents1 = rentService.selectByExample(new RentExample());
                    PageInfo<Rent> pageInfo = new PageInfo<>(rents1);
                    model.addAttribute("pageInfo",pageInfo);
                    model.addAttribute("error","该记录不存在");
                    return "rentman";
                }
                PageInfo<Rent> pageInfo = new PageInfo<>(rents);
                model.addAttribute("pageInfo",pageInfo);
            }
        }
        return "rentman";
    }

    @RequestMapping("/selectivedamage")
    public String selectivedamage(@RequestParam String selective,@RequestParam String keywords,HttpSession httpSession,Model model){
        if (httpSession.getAttribute("login") == null) {
            return "redirect:/login.jsp";
        }

        if(selective!=null){
            Integer id = Integer.valueOf(keywords);
            if(selective.equals("damageid")){
                PageHelper.startPage(1,100);
                Damage damage = damageService.selectByPrimaryKey(id);
                if(damage==null){
                    PageHelper.startPage(1,5);
                    List<Damage> damages = damageService.selectByExample(new DamageExample());
                    PageInfo<Damage> pageInfo = new PageInfo<>(damages);
                    model.addAttribute("pageInfo",pageInfo);
                    model.addAttribute("error","该记录不存在");
                    return "damage";
                }
                List<Damage> damages = new ArrayList<>();
                damages.add(damage);
                PageInfo<Damage> pageInfo = new PageInfo<>(damages);
                model.addAttribute("pageInfo",pageInfo);

            }else{
                DamageExample damageExample = new DamageExample();
                damageExample.createCriteria().andEquidEqualTo(id);
                PageHelper.startPage(1,100);
                List<Damage> damages = damageService.selectByExample(damageExample);
                if(damages==null){
                    PageHelper.startPage(1,5);
                    List<Damage> list = damageService.selectByExample(new DamageExample());
                    PageInfo<Damage> pageInfo = new PageInfo<>(list);
                    model.addAttribute("pageInfo",pageInfo);
                    model.addAttribute("error","该记录不存在");
                    return "damage";
                }
                PageInfo<Damage> pageInfo = new PageInfo<>(damages);
                model.addAttribute("pageInfo",pageInfo);
            }
        }
        return "damage";
    }
}
