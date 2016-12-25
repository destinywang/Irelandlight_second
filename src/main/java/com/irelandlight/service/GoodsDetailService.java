package com.irelandlight.service;

import com.irelandlight.mapper.GoodsDetailMapper;
import com.irelandlight.model.GoodsImage;

import com.irelandlight.vo.CommentGoods;
import com.irelandlight.vo.CommentVO;
import com.irelandlight.vo.GoodsAll;
import com.irelandlight.vo.GoodsInfo;
import com.irelandlight.vo.SizePrice;
import com.irelandlight.vo.ReplyVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mr.w on 2016/12/25.
 */
@Service
public class GoodsDetailService {
    @Resource
    private GoodsDetailMapper goodsDetailMapper;

    /**
     * 返回商品的轮播图
     * @param id
     * @return
     */
    List<GoodsImage> queryGoodsImage(int id){
        return goodsDetailMapper.queryGoodsImage(id);
    }

    /**
     * 查询某个商品的全部信息
     * @param id
     * @return
     */
    GoodsAll  queryGoodsDetail(int id){
        GoodsInfo goodsInfo=goodsDetailMapper.queryGoodsDetail(id);
        List<SizePrice> sizePrices=goodsDetailMapper.qureySizePrice(id);
        GoodsAll goodsAll=new GoodsAll();
        goodsAll.setGoodsInfo(goodsInfo);
        goodsAll.setSizePrices(sizePrices);
        return goodsAll;

    }

    public List<CommentVO> queryComments(int id){
        //创建一个评论包装列表，包含对商品的评论和对评论的回复
        List<CommentVO> commentVOs=new ArrayList<CommentVO>();

        //获取对这个商品的所有评论
        List<CommentGoods> commentGoodses=goodsDetailMapper.queryCommentGoods(id);

        //获取这个商品下的所有回复
        List<ReplyVO> replyVOs=goodsDetailMapper.queryComments(id);

        //遍历对商品的评论
        for(CommentGoods commentGoods:commentGoodses){
            //创建一个评论包装类，将某一条对商品的评论和这个评论下的所有回复包装在一起
            CommentVO commentVO=new CommentVO();
            //将对商品的评论添加到包装类
            commentVO.setCommentGoods(commentGoods);
            //遍历回复，将对这条评论的所有回复添加到包装类
            //创建一个回复列表，用来存放符合条件（是这个评论下面的回复）的回复
            List<ReplyVO> replyVOs1=new ArrayList<ReplyVO>();
            for(ReplyVO replyVO:replyVOs){
                //如果是这个评论下面的回复
                if(replyVO.getSourceId()==commentGoods.getCommentId()){
                    //如果它的toNickName为空，则将其设置为管理员
                    if(replyVO.getToNickName()==null){
                        replyVO.setToNickName("管理员");
                    }
                    //如果它的fromNickName为空，将其设置为管理员
                    if(replyVO.getFromNickName()==null){
                        replyVO.setFromNickName("管理员");
                    }
                    replyVOs1.add(replyVO);
                }

            }
            commentVO.setReplyVOs(replyVOs1);
            commentVOs.add(commentVO);
        }
        return commentVOs;
    }
}
