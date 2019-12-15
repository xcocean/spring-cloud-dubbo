package com.qbccn.provider.demo.service;

import com.qbccn.provider.demo.api.SayHiService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class SayHiServiceImpl implements SayHiService {
    @Value("${dubbo.protocol.port}")
    public String port;

    @Override
    public String sayHi(String msg) {
        return "say Hi :" + msg + " port:" + port;
    }
}
