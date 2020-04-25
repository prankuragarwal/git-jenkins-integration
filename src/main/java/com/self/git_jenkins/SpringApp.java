package com.self.git_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication(
        exclude = {ContextRegionProviderAutoConfiguration.class, ContextStackAutoConfiguration.class})
public class SpringApp {

    public static void main(String[] args) {

        SpringApplication.run(SpringApp.class, args);
    }
}
