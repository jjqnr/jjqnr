package com.jjqnr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lzz on 2018/9/11.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{id}")
    public String list(@PathVariable("id") String id) {
        return id + "/test";
    }
}


