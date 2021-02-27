package ru.netology.domain;

public class CommentsInfo {
    int countOfComments;
    boolean canPost;
    boolean groupsCanPost;
    boolean canClose;
    boolean canOpen;
    int commentId;
    String commentText;
    boolean liked;
    int countOfPostLiked;
    String commentAppeal;

    public int getCountOfComments() {
        return countOfComments;
    }

    public void setCountOfComments(int countOfComments) {
        this.countOfComments = countOfComments;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

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
