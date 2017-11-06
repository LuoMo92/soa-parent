
package com.soa.order.facade; 

import com.soa.order.domain.Order;

import java.util.List;

public interface OrderFacade {
    public List<Order> findOrderByUserId(Integer userId);
    
    public Integer createOrder(Order obj);
    
    public void updateOrderByTrade(Order obj);
}
 