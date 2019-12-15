package com.qbccn.consumer.demo.comtroller;

import com.qbccn.provider.demo.api.SayHiService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebComtroller {
    @Reference(version = "1.0.0")
    private SayHiService sayHiService;

    @GetMapping(value = "/sayHi/{msg}")
    public String echo(@PathVariable String msg) {
        return sayHiService.sayHi(msg);
    }
}
