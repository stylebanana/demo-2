package com.example.demo.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.Orders;
import com.example.demo.vo.OrdersVO;

public class IOrdersService {
    IPage<OrdersVO> selectOrdersPage(IPage<OrdersVO> page, OrdersVO orders);
}
