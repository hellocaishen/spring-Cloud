package Eureka.scrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动类
 * @author zhoufs
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class startEureka 
{
    public static void main( String[] args ){
    	SpringApplication.run(startEureka.class, args);
    }
}
