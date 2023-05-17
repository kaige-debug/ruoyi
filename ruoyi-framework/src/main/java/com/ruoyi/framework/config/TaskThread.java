package com.ruoyi.framework.config;

import com.ruoyi.common.utils.spring.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
@Configuration
public class TaskThread extends Thread{


    /**
     * 单例模式
     * @return
     */
    private  AtomicInteger i = new AtomicInteger(1);

    private static TaskThread taskThread = new TaskThread();

    public TaskThread(){}


    @Bean(name = "TaskThread")
    public static TaskThread getInstance(){
        return taskThread;
    }

    @Override
    public void run(){
        synchronized (TaskThread.class) {
            try {
                System.out.println("线程-" + Thread.currentThread().getName() + "被线程池执行");
                Thread.sleep(1000);
            } catch (InterruptedException i) {
                i.getStackTrace();
            }
        }
    }

}
