//package com.bench.consumer;
//
//import com.bench.demo.DemoService;
//import org.apache.dubbo.config.annotation.DubboReference;
//import org.apache.dubbo.config.annotation.DubboService;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
///**
// * @Author bench
// * @Date 2024/06/24 09:26
// **/
//@Component
//public class Task implements CommandLineRunner {
//
//    @DubboReference
//    private DemoService demoService;
//    @Override
//    public void run(String... args) throws Exception {
//        String result = demoService.sayHello("bench");
//        System.out.println("Recive result --------> " + result);
//
//        new Thread(()->{
//            while (true){
//                try {
//                    Thread.sleep(1000);
//                    System.out.println(new Date() + "Recive result ---> " + demoService.sayHello("bench"));
//                } catch (InterruptedException e){
//                    e.printStackTrace();
//                    Thread.currentThread().interrupt();
//                }
//            }
//        }).start();
//    }
//}
