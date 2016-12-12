package com.irelandlight.service.inter;

import com.irelandlight.vo.CustomMessageSimple;
import com.irelandlight.vo.PurchaseHistory;

import java.util.List;

/**
 * Created by lalala on 2016/12/8.
 */
public interface MessageSimple {

    public List<MessageSimple> findHistoryMessageSimple(Long from_id, Long to_id)throws Exception;

    public CustomMessageSimple findCustomMessage(Long id)throws Exception;

    public List<PurchaseHistory> findPurchaseHistory(Long id) throws Exception;

    public void insertMessageSimple(Long from_id, Long to_id, String content, int type)throws Exception;
}
