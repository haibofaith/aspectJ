package xyz.haibofaith.basemvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author:haibo.xiong
 * @date:2019/4/29
 * @description:
 */
@Controller
public class HelloWorld {
    @RequestMapping(value = "/helloKitty")
    @ResponseBody
    public String helloKitty(HttpServletRequest request) {
        return "kittyCat";
    }

    @RequestMapping(value = "/error")
    public String error(HttpServletRequest request) {
        return "kittyCat";
    }

    @RequestMapping(value = "/errorPage")
    public ModelAndView errorPage(HttpServletRequest request) {
        return new ModelAndView("error");
    }
}
