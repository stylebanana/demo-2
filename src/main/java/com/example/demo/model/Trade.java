package com.example.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode()
public class Trade implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */

    private Integer tId;
    /**
     * 淘宝昵称
     */

    private String buyerNick;
    /**
     * 买家电话
     */

    private String buyerPhone;
    /**
     * 接受人姓名
     */

    private String receiverName;
    /**
     * 收货地址
     */

    private String receiverAddress;
    /**
     * 收货城市
     */

    private String receiverCity;
    /**
     * 订单状态: TRADE_FINISHED(交易成功),TRADE_CLOSED(付款以后用户退款成功,交易自动关闭), TRADE_CLOSED_BY_TAOBAO(付款以前, 卖家或买家主动关闭交易)
     */
    private String tradeStatus;
    /**
     * 创建时间
     */

    private LocalDateTime createTime;


}
