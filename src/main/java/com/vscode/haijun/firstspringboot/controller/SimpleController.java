package com.vscode.haijun.firstspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    /**
     * 获取配置文件信息
     */
    @Value("${spring.application.name}")
    String appName;
 
    @GetMapping("/test")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("lang", "zh_CN");
        return "extjsTest";
    }
}