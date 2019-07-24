package com.scg.springbootswaggerui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages={"com.scg.springbootswaggerui"})
@ServletComponentScan
@EnableSwagger2
@Controller
@Slf4j
public class SpringbootSwaggeruiApplication {

    public static void main(String[] args) {
        log.info("宝宝起来啦！！！");
        SpringApplication.run(SpringbootSwaggeruiApplication.class, args);
    }

}
