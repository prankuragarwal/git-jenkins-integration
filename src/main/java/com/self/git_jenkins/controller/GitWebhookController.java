package com.self.git_jenkins.controller;

import com.self.git_jenkins.pojo.WebhookRequest;
import com.self.git_jenkins.service.TaskTriggerService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@EnableAsync
@AllArgsConstructor
public class GitWebhookController {
    private static final String GIT_WEBHOOK_CONTROLLER = "/git/webhook";
    private final TaskTriggerService taskTriggerService;

    @RequestMapping(
            path = GIT_WEBHOOK_CONTROLLER,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST)
    public ResponseEntity uploadPolicies(
            @Valid @RequestBody final WebhookRequest webhookRequest
    )  {
        taskTriggerService.process(webhookRequest);
        return ResponseEntity.ok().build();
    }
}
