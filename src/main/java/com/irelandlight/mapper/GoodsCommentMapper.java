package com.irelandlight.mapper;

import com.irelandlight.vo.GoodsComment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mr.w on 2016/12/12.
 */
@Repository
public interface GoodsCommentMapper {
    //查询商品的评论表中的id，createTime，goodsId,consumerId,comment
    List<GoodsComment>  selectGoodsComment(@Param("goodsId") Long goodsId)throws Exception;
}
