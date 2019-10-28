package cn.how2j.controller;

import cn.how2j.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FirstController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET)
    public String findPerson(@PathVariable("personId") Integer personId) {
        Person person = new Person(personId, "<==id， 调用端口号==>", Integer.valueOf(port));
        return person.toString();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello，端口["+port+"]前来报道！";
    }
}
