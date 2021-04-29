package com.ETE_Backend_wala.End_term_backend.UrlMapping;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutMapping {
    
    @RequestMapping("/")
    public String maino()
    {
        return "index";
    }

    @RequestMapping("/userinfo")
    public String userinfo()
    {
        return "html/Userinfo";
    }
}
