package com.self.git_jenkins.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class WebhookRequest {
    private String action;
    private String state;
    private Boolean merged;
}
