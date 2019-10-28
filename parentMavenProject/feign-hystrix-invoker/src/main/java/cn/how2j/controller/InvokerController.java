package cn.how2j.controller;

import cn.how2j.service.InvokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvokerController {

    @Autowired
    InvokerService invokerService;

    @RequestMapping(value = "/helloInvoker", method = RequestMethod.GET)
    public String hello() {
        return invokerService.hello();
    }

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET)
    public String router(@PathVariable("personId") Integer personId) {
        return invokerService.router(personId);
    }
}
