package com.haohao.novel;

import com.haohao.entity.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = ("com.haohao.novel.dao"))
@EnableDiscoveryClient
@EnableFeignClients // 开启Feign的客户端
public class NovelApplication {

    /**
     * 启动方法
     */
    public static void main(String[] args) {
        SpringApplication.run(NovelApplication.class,args);
    }

    /**
     * IdWorker
     * @return
     */
    public IdWorker idWorker(){
        return new IdWorker(00,0);
    }


}
