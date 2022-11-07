package com.example.demo.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CityDataVo implements Serializable {


    private String city;

    private BigDecimal price;
}
