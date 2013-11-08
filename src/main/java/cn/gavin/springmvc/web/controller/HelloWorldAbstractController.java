package cn.gavin.springmvc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldAbstractController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello SpringMVC AbstractController");

        mv.setViewName("hello");
        return mv;
    }

}
