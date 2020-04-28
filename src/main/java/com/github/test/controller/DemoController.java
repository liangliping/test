package com.github.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: DemoController <br>
 *
 * @author Liang lp
 * Date: 2020/4/28 10:36 <br>
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/query")
    public String testQuery(){
        return "畅通无阻";
    }
}
