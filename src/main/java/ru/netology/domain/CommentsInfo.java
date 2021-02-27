package ru.netology.domain;

public class CommentsInfo {
    int commentId;
    String commentText;
    boolean liked;
    int countOfPostLiked;
    String commentAppeal;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public int getCountOfPostLiked() {
        return countOfPostLiked;
    }

    public void setCountOfPostLiked(int countOfPostLiked) {
        this.countOfPostLiked = countOfPostLiked;
    }

    public String getCommentAppeal() {
        return commentAppeal;
    }

    public void setCommentAppeal(String commentAppeal) {
        this.commentAppeal = commentAppeal;
    }
}
