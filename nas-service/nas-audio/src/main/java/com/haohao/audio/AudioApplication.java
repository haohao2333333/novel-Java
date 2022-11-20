package com.haohao.audio;

import com.haohao.entity.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = ("com.haohao.audio.dao"))
@EnableDiscoveryClient
public class AudioApplication {

    public static void main(String[] args) {
        SpringApplication.run(AudioApplication.class);
    }

    /**
     * IdWorker
     * @return
     */
    public IdWorker idWorker(){
        return new IdWorker(00,0);
    }


}