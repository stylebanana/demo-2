package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.model.Orders;
import com.example.demo.vo.OrdersVO;

import java.util.List;

public interface OrdersMapper extends BaseMapper<Orders> {
    List<OrdersVO> selectOrdersPage(IPage page, OrdersVO orders);
}
