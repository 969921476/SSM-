package com.cjn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author： cjn
 * @create： 2020-07-03 11:34
 * @Description：
 * @Modified By:
 */
@Controller
public class TestController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
