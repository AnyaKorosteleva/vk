package ru.netology.domain;

public class RepostInfo {
    int countOfRepost;
    boolean canPublish;
    boolean userReposted;

    public int getCountOfRepost() {
        return countOfRepost;
    }

    public void setCountOfRepost(int countOfRepost) {
        this.countOfRepost = countOfRepost;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
}
