package com.wade.springboot.springboot_feature_demo.controller.jsp;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldJSPController {

    @RequestMapping("/say-hello-jsp")
    @ResponseBody
    public String sayhello() {
        return "Hello, jsp";
    }

    @RequestMapping("say-hello-jsp-sb")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("/say-hello-jsp-page")
    public String sayHelloJsp() {
        // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
        return "sayHello";
    }

}
