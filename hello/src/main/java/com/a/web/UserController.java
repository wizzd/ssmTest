package com.a.web;

import com.a.domain.User;
import com.a.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RestController
public class UserController {
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping(value = "/i.html")
    public String loginPage(){return "login";}
    @RequestMapping(value = "/success.html")
    public ModelAndView test(HttpServletRequest request,LoginCommand loginCommand)
    {
        User user = userService.hasMatch(loginCommand.getName(),loginCommand.getPass());
        if (user!=null ){
            request.getSession().setAttribute("user", user);
            return new ModelAndView("success");
        }else return new ModelAndView("error");

    }
}
