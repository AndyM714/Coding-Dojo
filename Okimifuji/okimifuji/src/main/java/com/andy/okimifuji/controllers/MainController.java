package com.andy.okimifuji.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller



public class MainController {
    

    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }

   
    @PostMapping("/omikuji")
    public String omikuji(
        @RequestParam(value = "number") Integer number, 
        @RequestParam(value = "location") String location, 
        @RequestParam(value = "name") String name, 
        @RequestParam(value = "hobby") String hobby, 
        @RequestParam(value = "livingThing") String livingThing, 
        @RequestParam(value = "niceComment") String niceComment, 
        HttpSession session) {

        
        session.setAttribute("number", number);
        session.setAttribute("location", location);
        session.setAttribute("name", name);
        session.setAttribute("hobby", hobby);
        session.setAttribute("livingThing", livingThing);
        session.setAttribute("niceComment", niceComment);
        return "redirect:/omikuji/show";
    }

    @RequestMapping("/omikuji/show")
    public String show() {
        return "showOmikuji.jsp";
    }

    
    
    
}