package com.irelandlight.mapper;

import com.irelandlight.vo.GoodsReply;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/12.
 */
@Repository
public interface GoodsReplyMapper {
    //查询reply表中的id ,createTime,fromId,reply
    //此处需要传入comment表的id
    List<GoodsReply> selectGoodsReply(@Param("id")int id)throws Exception;
}
