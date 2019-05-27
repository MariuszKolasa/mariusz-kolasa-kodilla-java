package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int userPosts;

    public ForumUser(final int userID,final String userName,final char userSex,final LocalDate dateOfBirth,final int userPosts) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = dateOfBirth;
        this.userPosts = userPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getUserPosts() {
        return userPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userID != forumUser.userID) return false;
        if (userSex != forumUser.userSex) return false;
        if (userPosts != forumUser.userPosts) return false;
        if (!userName.equals(forumUser.userName)) return false;
        return dateOfBirth.equals(forumUser.dateOfBirth);

    }

    @Override
    public int hashCode() {
        int result = userID;
        result = 31 * result + userName.hashCode();
        result = 31 * result + (int) userSex;
        result = 31 * result + dateOfBirth.hashCode();
        result = 31 * result + userPosts;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                 userID + ":"+
                 userName + '\'' +
                '}';
    }
}
