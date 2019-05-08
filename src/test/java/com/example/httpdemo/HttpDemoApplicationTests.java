package com.example.httpdemo;

import com.example.httpdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpDemoApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void httpdemo(){

        User user = restTemplate.getForObject("http://localhost:9969/user/getuserinfo", User.class);
        System.out.printf("user2222=" + user);

    }

}
