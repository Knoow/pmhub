package com.laigeoffer.pmhub.workflow;

import com.laigeoffer.pmhub.base.security.annotation.EnableCustomConfig;
import com.laigeoffer.pmhub.base.security.annotation.EnablePmFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author canghe
 * @description 工作流服务
 * @create 2024-04-25-17:45
 */
@EnableCustomConfig
@EnablePmFeignClients
@SpringBootApplication
public class PmHubWorkflowApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmHubWorkflowApplication.class, args);
    }
}