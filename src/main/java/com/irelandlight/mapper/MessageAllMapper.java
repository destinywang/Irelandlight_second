package com.irelandlight.mapper;

import com.irelandlight.vo.CustomMessageAll;
import com.irelandlight.vo.MessageAll;

import java.util.List;

/**
 * Created by lalala on 2016/12/10.
 */
public interface MessageAllMapper {

    //用户列表（用户id,头像，新聊天）
    public List<CustomMessageAll> findUserList()throws Exception;

    //所有用户id
    public List<Long> findUserAll()throws Exception;

    //群发消息(发送)
    public void insertMessageAll(Long from_id, Long to_id, String content, int type)throws Exception;

    //群发历史消息
    public List<MessageAll> findHistoryMessageAll()throws Exception;
}
