package com.self.git_jenkins.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "jenkinsJobExecutor", url = "")
public interface JenkinsClient {
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Object createPolicy(
            @RequestHeader("Authorization") final String authorization,
            @RequestBody final String request
    );
}
