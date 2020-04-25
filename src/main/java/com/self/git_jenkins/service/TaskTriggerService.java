package com.self.git_jenkins.service;

import com.self.git_jenkins.pojo.WebhookRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Log4j2
public class TaskTriggerService {
    public void process(final WebhookRequest webhookRequest) {
        if (webhookRequest.getMerged() && webhookRequest.getAction().equals("closed") && webhookRequest.getState().equals("closed")){
            log.info("valid request: " + webhookRequest.toString());
        } else {
            log.info("invalid request: " + webhookRequest.toString());
        }
    }
}
