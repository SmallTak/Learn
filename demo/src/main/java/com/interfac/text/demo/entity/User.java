package com.interfac.text.demo.entity;

import java.util.Objects;

public class User {

    public String userName;
    public Integer userCard;
    public String userNc;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserCard() {
        return userCard;
    }

    public void setUserCard(Integer userCard) {
        this.userCard = userCard;
    }

    public String getUserNc() {
        return userNc;
    }

    public void setUserNc(String userNc) {
        this.userNc = userNc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(userCard, user.userCard) &&
                Objects.equals(userNc, user.userNc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName, userCard, userNc);
    }
}
