package mspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

    @RequestMapping("/hello.html")
    public ModelAndView handleRequest() {
        ModelAndView helloSpring = new ModelAndView("hello");
        helloSpring.addObject("message1", "1HELLO!!!");
        helloSpring.addObject("message2", "2HELLO!!!");
        helloSpring.addObject("message3", "3HELLO!!!");
        helloSpring.addObject("message4", "4HELLO!!!");
        return helloSpring;
    }

    @RequestMapping("/hi")
    public ModelAndView handleHiRequest() {
        ModelAndView helloSpring = new ModelAndView("helloFreeMarker");
        helloSpring.addObject("message", "HiFreeeMarker......!!!");
        return helloSpring;
    }

}
