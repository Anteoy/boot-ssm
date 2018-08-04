package com.allocmem.bootssm.controller;

import com.allocmem.bootssm.dao.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhoudazhuang on 18-8-4.
 */
@Controller
public class boot {
    @Autowired
    private CityMapper cityMapper;

    @GetMapping("/")
    public String boot() {
        return "index";
    }

    @GetMapping("/get")
    @ResponseBody
    public Object get() {
        System.out.println(this.cityMapper.findByState("CA"));
        return this.cityMapper.findByState("CA");
    }
}
