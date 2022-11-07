package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.Trade;
import com.example.demo.vo.TradeVO;

public interface ITradeService extends IService<Trade> {

	IPage<TradeVO> selectTradePage(IPage<TradeVO> page, TradeVO trade);

}
