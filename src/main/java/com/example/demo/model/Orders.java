package com.example.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode()

public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子订单编号
     */

    private Integer oId;
    /**
     * 订单号
     */

    private Integer tId;
    /**
     * 卖家店铺
     */

    private String sellerShop;
    /**
     * 商品分类
     */

    private String cid;
    /**
     * 商品标题
     */

    private String title;
    /**
     * 商品价格
     */

    private Float price;
    /**
     * 折扣
     */

    private Float discountFee;
    /**
     * 购买数量
     */

    private Integer num;


}
