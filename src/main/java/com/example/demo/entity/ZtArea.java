package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ZtArea entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zt_area")
public class ZtArea implements java.io.Serializable {

    // Fields

    private Integer areaId;
    private String name;
    private String location;
    private String memo;

    // Constructors

    /** default constructor */
    public ZtArea() {
    }

    /** minimal constructor */
    public ZtArea(Integer areaId, String name, String location, String memo) {
        this.areaId = areaId;
        this.name = name;
        this.location = location;
        this.memo = memo;
    }


    // Property accessors
    @Id
    @Column(name = "areaID", unique = true, nullable = false)
    public Integer getAreaId() {
        return this.areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Column(name = "name", nullable = false, length = 30)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "location", nullable = false, length = 30)
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "memo", nullable = false)
    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }



}