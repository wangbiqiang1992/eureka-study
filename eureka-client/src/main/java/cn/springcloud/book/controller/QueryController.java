package cn.springcloud.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    EurekaClientConfigBean eurekaClientConfigBean;

    @Autowired
    ConfigurableEnvironment configurableEnvironment;

    @GetMapping("/eureka-server")
    public Object getEurekaServer(){
        return eurekaClientConfigBean.getServiceUrl();
    }
}
