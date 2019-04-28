package com.example.demo.action;

import com.example.demo.entity.ZtArea;
import com.example.demo.repository.AreaRepository;
import com.example.demo.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hello")
@CrossOrigin(origins = "*",maxAge = 3600)
public class HelloAction {
    @Autowired
    public AreaRepository areaRepository;
    @Autowired
    public ManageService manageService;
    @RequestMapping("/test")
    @ResponseBody
    public List test(String name, Model model){
        List list=manageService.getAreaList(name);
        model.addAttribute("aress",list);
        return list;
    }
    @RequestMapping("/getOneArea/{id}")
    @ResponseBody
    public ZtArea getOneArea(@PathVariable("id") Integer id){
        return areaRepository.getOne(id);
    }
    @RequestMapping("/saveOne")
    @ResponseBody
    public ZtArea saveOne(@RequestBody ZtArea area){
        return areaRepository.save(area);
    }
}
