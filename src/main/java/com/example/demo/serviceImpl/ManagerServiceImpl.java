package com.example.demo.serviceImpl;

import com.example.demo.repository.AreaRepository;
import com.example.demo.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements ManageService {
    @Autowired
    AreaRepository areaRepository;
    @Override
    public List getAreaList(String name) {
        return areaRepository.findByNameLikeOrderByAreaIdDesc(name);
    }
}
