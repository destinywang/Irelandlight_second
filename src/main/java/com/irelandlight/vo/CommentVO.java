package com.irelandlight.vo;

import com.irelandlight.model.Comment;

import java.util.List;

/**
 * Created by mr.w on 2016/12/18.
 */
public class CommentVO {
    private CommentGoods commentGoods;
    private List<ReplyVO> replyVOs;

    public CommentGoods getCommentGoods() {
        return commentGoods;
    }

    public void setCommentGoods(CommentGoods commentGoods) {
        this.commentGoods = commentGoods;
    }

    public List<ReplyVO> getReplyVOs() {
        return replyVOs;
    }

    public void setReplyVOs(List<ReplyVO> replyVOs) {
        this.replyVOs = replyVOs;
    }
}
