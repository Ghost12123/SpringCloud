package cn.how2j.service;

import cn.how2j.client.FeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class InvokerService {
    @Autowired
    FeignHystrixClient feignHystrixClient;

    public String hello() {
        return feignHystrixClient.hello();
    }

    public String router(Integer personId) {
        return feignHystrixClient.router(personId);
    }
}
