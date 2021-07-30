package com.mall.order.domain;

import lombok.Data;

@Data
public class MqCancelOrder {

    private Long orderId;

    private Long memberId;
}
