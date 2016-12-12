package com.irelandlight.mapper;



import com.irelandlight.vo.MessageSimple;
import com.irelandlight.vo.CustomMessageSimple;
import com.irelandlight.vo.PurchaseHistory;

import java.util.List;

/**
 * Created by lalala on 2016/12/6.
 */
public interface MessageSimpleMapper {

    //单人通话记录
    public List<MessageSimple> findHistoryMessageSimple(Long from_id, Long to_id)throws Exception;

    //客户信息（ID，昵称，电话，头像地址）
    public CustomMessageSimple findCustomMessage(Long id)throws Exception;

    //客户购买记录（购买时间,物品id）
    public List<PurchaseHistory> findPurchaseHistory(Long id)throws Exception;

    //管理员信息
    //public RootMessage findRootMessage()throws Exception;

    //插入对话
    public void insertMessageSimple(Long from_id, Long to_id, String content, int type)throws Exception;

}
