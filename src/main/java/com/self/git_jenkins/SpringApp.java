package com.self.git_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(
        exclude = {ContextRegionProviderAutoConfiguration.class, ContextStackAutoConfiguration.class})
public class SpringApp {

    public static void main(String[] args) {

        SpringApplication.run(SpringApp.class, args);
    }
}
