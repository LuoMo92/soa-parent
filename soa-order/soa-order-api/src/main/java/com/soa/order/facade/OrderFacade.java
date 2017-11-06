
package com.soa.order.facade; 

import com.soa.order.domain.Order;

import java.util.List;

public interface OrderFacade {
     List<Order> findOrderByUserId(Integer userId);
    
     Integer createOrder(Order obj);
    
    void updateOrderByTrade(Order obj);
}
 