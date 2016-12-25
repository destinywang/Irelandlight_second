package com.irelandlight.mapper;

import com.irelandlight.model.Comment;
import com.irelandlight.model.GoodsImage;
import com.irelandlight.vo.CommentGoods;
import com.irelandlight.vo.GoodsInfo;
import com.irelandlight.vo.ReplyVO;
import com.irelandlight.vo.SizePrice;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/19.
 */
@Repository
public interface GoodsDetailMapper {
    /*
     *查询商品轮播图
     *@Param id
     * @return id对应的图片列表
     **/
    List<GoodsImage> queryGoodsImage(int id);
    /*
    * 查询商品的所有信息
    * @Param id
    * @return id对应的商品的所有信息
    * */
    GoodsInfo queryGoodsDetail(int id);
    /*
    * 查询商品的价格尺寸表
    * @Param id
    * @return
    * */
    List<SizePrice> qureySizePrice(int id);
    /*
    * 查询商品的评论
    * @Param id
    * @return
    * */
    List<CommentGoods> queryCommentGoods(int id);
    /*
    * 查询评论的评论
    * @Param commentId
    * @return
    * */
    List<ReplyVO> queryComments(int id);
    /*
    * 添加评论
    * @ Param comment
    * */
    void addComment(Comment comment);
}
