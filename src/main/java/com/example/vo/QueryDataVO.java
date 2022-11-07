package com.example.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryDataVO implements Serializable {

    private String start_time;

    private String end_time;
}
