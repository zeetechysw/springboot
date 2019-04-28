package com.example.demo;

import com.example.demo.entity.ZtArea;
import com.example.demo.repository.AreaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class DemoApplicationTests {
    @Autowired
    private AreaRepository areaRepository;
    @Test
    public void contextLoads() {
    }

    @Test
    public void test() throws Exception {
        areaRepository.save(new ZtArea(7, "测试", "深圳","123"));
        System.out.println(areaRepository.findAll().size());
        System.out.println(areaRepository.findByName("测试").getAreaId());
        //areaRepository.delete(areaRepository.findByNameOrLocation("测试",""));
    }

}
