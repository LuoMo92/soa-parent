package com.soa.order.facade; 

import com.soa.order.domain.Order;
import com.soa.order.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OrderFacadeImpl implements OrderFacade{

    @Resource
    private OrderService orderService;

    public List<Order> findOrderByUserId(Integer userId){
        return this.orderService.findOrderByUserId(userId);
    }

    public Integer createOrder(Order obj){
        this.orderService.createOrder(obj);
        return obj.getId();
    }

    public void updateOrderByTrade(Order obj){
        this.orderService.updateOrderByTrade(obj);
    }
}
 