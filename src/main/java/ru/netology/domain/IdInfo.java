package ru.netology.domain;

public class IdInfo {
    String postName;
    int postAdded;
    String postText;
    boolean groupsubscribe;

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public int getPostAdded() {
        return postAdded;
    }

    public void setPostAdded(int postAdded) {
        this.postAdded = postAdded;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public boolean isGroupsubscribe() {
        return groupsubscribe;
    }

    public void setGroupsubscribe(boolean groupsubscribe) {
        this.groupsubscribe = groupsubscribe;
    }
}
