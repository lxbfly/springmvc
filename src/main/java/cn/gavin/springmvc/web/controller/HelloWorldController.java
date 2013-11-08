package cn.gavin.springmvc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello Spring MVC!");
        // set pageview, the view parser will according to this name find specific view page.
        mv.setViewName("hello");
        return mv;

        // Map<String, String> model = new HashMap<String, String>();
        // model.put("message", "Hello Spring MVC!");
        // return new ModelAndView("hello", model);

    }

}