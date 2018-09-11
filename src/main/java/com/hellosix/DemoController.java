package com.hellosix;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lzz on 2018/9/11.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/{id}")
    public String list(@PathVariable("id") String id) {
        return id + "/test";
    }
}