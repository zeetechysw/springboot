package com.example.demo.repository;

import com.example.demo.entity.ZtArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository extends JpaRepository<ZtArea, Integer> {
    ZtArea findByName(String name);
    ZtArea findByNameOrLocation(String name, String location);
    List<ZtArea>  findByNameLikeOrderByAreaIdDesc(String name);
}
