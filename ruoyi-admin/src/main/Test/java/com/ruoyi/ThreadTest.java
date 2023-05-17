package com.ruoyi;



import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.framework.config.TaskThread;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import java.util.concurrent.atomic.AtomicInteger;
//import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest(classes = RuoYiApplication.class)
public class ThreadTest {




    public static void main(String[] args) {
        System.gc();
        ThreadPoolTaskExecutor executor = SpringUtils.getBean("threadPoolTaskExecutor");
        for (int i = 0; i < 20; i++) {
            AtomicInteger atomicInteger = new AtomicInteger(i);
//            executor.execute(new TaskThread(atomicInteger));
        }
    }
    @Test
    public static void test(){


    }
}
