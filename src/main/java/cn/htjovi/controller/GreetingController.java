package cn.htjovi.controller;

import cn.htjovi.dao.CardDao;
import cn.htjovi.entity.CardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by 13041 on 2018/1/25.
 */
@RestController("/hello")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private CardDao cardDao;

    @RequestMapping(path = "/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello Services";
    }

    @RequestMapping(path = "/show")
    public Iterable<CardEntity> show(){
        return cardDao.findAll();
    }
}