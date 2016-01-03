package com.lanhuai.examples.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lanhuai
 */
@Controller
public class LoginController {

    /**
     * 配合 contentNegotiationManager /login 可以让 /login 与 /login.html 都能访问
     * @return viewName
     */
    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/test")
    public String showTestJsp() {
        return "test.jsp";
    }
}
