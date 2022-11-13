package com.haohao.video;

import entity.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = ("com.haohao.video.dao"))
@EnableDiscoveryClient
public class VideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class);
    }

    /**
     * IdWorker
     * @return
     */
    public IdWorker idWorker(){
        return new IdWorker(00,0);
    }


}
