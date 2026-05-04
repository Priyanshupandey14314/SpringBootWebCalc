package com.priyanshu.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/add")
    //Servlet way req handling
//    public String add(/*HttpServletRequest req*/@RequestParam("num1") int newName, int num2, Model model){
////        System.out.println("In add");
//////        int n1 = Integer.parseInt(req.getParameter("num1"));
//////        int n2 = Integer.parseInt(req.getParameter("num2"));
////        int res = newName+num2;
//////        session.setAttribute("res",res);
////        model.addAttribute("result", res);
////        System.out.println(res);
////        return "result";
////    }
    public ModelAndView add(/*HttpServletRequest req*/@RequestParam("num1") int n1,
                                                      @RequestParam("num2") int n2,
                                                      ModelAndView mv) {
        System.out.println("In add");
        int res = n1 + n2;
        mv.addObject("result",res);
        mv.setViewName("result");
        System.out.println(res);
        return mv;
    }
}
