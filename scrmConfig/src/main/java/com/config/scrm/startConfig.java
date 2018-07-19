package com.config.scrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 注册中心启动类
 * @author zhoufs
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class startConfig 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(startConfig.class, args);
    }
}
