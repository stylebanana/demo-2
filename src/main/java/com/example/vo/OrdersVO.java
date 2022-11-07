package com.example.vo;

import com.example.demo.model.Orders;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrdersVO extends Orders {
	private static final long serialVersionUID = 1L;

}
