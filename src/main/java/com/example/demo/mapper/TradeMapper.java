package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.model.Trade;
import com.example.demo.vo.CityDataVo;
import com.example.demo.vo.TradeVO;

import java.util.List;

public interface TradeMapper extends BaseMapper<Trade> {
    List<TradeVO> selectTradePage(IPage page, TradeVO trade);

	List<CityDataVo> queryCityData();

}
