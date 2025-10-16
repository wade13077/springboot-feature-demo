package com.wade.springboot.springboot_feature_demo.controller.jsp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.wade.springboot.springboot_feature_demo.service.AuthenticationService;

@Controller
@SessionAttributes("name")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    // 因為有@RequestParam,後面要加?name=
    // http://localhost:8080/login_req?name=test
    @RequestMapping("login_req")
    public String gotoLoginPage(@RequestParam String name, ModelMap modle) {
        modle.put("name", name);
        logger.debug("Request param is {}" + name);
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password,
            ModelMap model) {

        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        model.put("errMsg", "Invalid Credentials! Please try again.");
        return "login";
    }
}