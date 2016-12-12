package com.irelandlight.service.inter;

import com.irelandlight.vo.CustomMessageAll;

import java.util.List;

/**
 * Created by lalala on 2016/12/10.
 */
public interface MessageAll {

    //用户信息列表
    public List<CustomMessageAll> findCustomMessageAll()throws Exception;

    //群发消息
    public void insertMessageAll(String content, int type, Long rootId)throws Exception;
}
