package ru.netology.domain;

public class LikesInfo {
    int count;
    boolean userLikes;
    boolean canLike;
    boolean can_publish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCan_publish() {
        return can_publish;
    }

    public void setCan_publish(boolean can_publish) {
        this.can_publish = can_publish;
    }
}
