package cn.com.scrm;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import cn.com.scrm.ServiceApplication;

/*@Configuration
@ComponentScan(basePackages = "cn.com.**")*/
public class ServletInitializer extends SpringBootServletInitializer {
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(ServiceApplication.class);
 }
}