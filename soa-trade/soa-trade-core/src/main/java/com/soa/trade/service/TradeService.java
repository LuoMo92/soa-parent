package com.soa.trade.service; 



import com.soa.trade.domain.Trade;
import com.soa.trade.persistence.TradeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TradeService {
    
    @Resource
    private TradeMapper tradeMapper;

    public void createTrade(Trade obj){
	this.tradeMapper.insert(obj);
    }

}
 