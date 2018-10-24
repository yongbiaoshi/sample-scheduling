package com.my.sample.scheduling.task;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RefreshScope
public class TestTask {

    @Scheduled(fixedDelayString = "${test.fixed.delay:2000}", initialDelayString = "${test.init.dealy:5000}")
    public void test() {
        System.out.println("测试定时任务" + new Date());
    }
}
