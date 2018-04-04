package com.ly.train.traindemo.serviceimpl;

import com.ly.train.traindemo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author cyc11845
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
