package com.irelandlight.vo;

/**
 * Created by mr.w on 2016/12/18.
 */
public class CommentFrom {
    private int id;                     //评论的id
    private String commentContent;     //评论内容
    private String fromName;          //评论来源
    private int commentId;            //被评论的评论id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }
}
