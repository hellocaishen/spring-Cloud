package cn.com.scrm;

import javax.servlet.Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@EnableAutoConfiguration  //开启mybatis注解
@SpringBootApplication
//@EnableEurekaServer //此服务即是eureka注册中心又是服务的提供者
@EnableEurekaClient
@EnableFeignClients
public class ServiceApplication{
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceApplication.class);
	  // 编码过滤器
    @Bean
    Filter characterEncodingFilter() {
        logger.info("==========初始化编码过滤器=================");
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }
    
    public static void main( String[] args ){
        SpringApplication.run(ServiceApplication.class, args);
    }
}