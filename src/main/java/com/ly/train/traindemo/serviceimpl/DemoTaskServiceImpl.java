package com.ly.train.traindemo.serviceimpl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cyc11845
 */
@Component
public class DemoTaskServiceImpl {

    @Scheduled(cron = "* */1 * * * *")
    public void showTheTime(){
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(day));
    }
}
