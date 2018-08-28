package com.likun.Controller;

import com.likun.domain.ConfigBean;
import com.likun.domain.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    ConfigTestBean configTestBean;


    @RequestMapping("/")
    public String index() {
        return configBean.getDesc();
    }
    @RequestMapping("/md")
    public String md() {
        return configTestBean.getAuthor()+":"+configTestBean.getName()+"("+configTestBean.getSecret()+"-"+configTestBean.getNumber()+")";
    }
}
