package com.kodilla.testing.forum.statistics;


public class ForumStatistics {

    private static int usersQuantity;
    private static int postsQuantity;
    private static int commentsQuantity;
    private static double avaragePostsPerUser;
    private static double avarageCommentsPerUser;
    private static double avarageCommentsPerPost;


    public static void setUsersQuantity(int usersQuantity) {
        ForumStatistics.usersQuantity = usersQuantity;
    }

    public static void setPostsQuantity(int postsQuantity) {
        ForumStatistics.postsQuantity = postsQuantity;
    }

    public static void setCommentsQuantity(int commentsQuantity) {
        ForumStatistics.commentsQuantity = commentsQuantity;
    }

    public static void setAvaragePostsPerUser(double avaragePostsPerUser) {
        ForumStatistics.avaragePostsPerUser = avaragePostsPerUser;
    }

    public static void setAvarageCommentsPerUser(double avarageCommentsPerUser) {
        ForumStatistics.avarageCommentsPerUser = avarageCommentsPerUser;
    }

    public static void setAvarageCommentsPerPost(double avarageCommentsPerPost) {
        ForumStatistics.avarageCommentsPerPost = avarageCommentsPerPost;
    }

    public static int getUsersQuantity() {
        return usersQuantity;
    }

    public static int getPostsQuantity() {
        return postsQuantity;
    }

    public static int getCommentsQuantity() {
        return commentsQuantity;
    }

    public static double getAvaragePostsPerUser() {
        return avaragePostsPerUser;
    }

    public static double getAvarageCommentsPerUser() {
        return avarageCommentsPerUser;
    }

    public static double getAvarageCommentsPerPost() {
        return avarageCommentsPerPost;
    }

    public static void calculateAdvStatistics(Statistics statistics) {
        if (usersQuantity > 0 && postsQuantity > 0) {
            setUsersQuantity(statistics.usersNames().size());
            setPostsQuantity(statistics.postsCount());
            setCommentsQuantity(statistics.commentsCount());
            setAvaragePostsPerUser(postsQuantity / usersQuantity);
            setAvarageCommentsPerUser(commentsQuantity / usersQuantity);
            setAvarageCommentsPerPost(commentsQuantity / postsQuantity);
        } else if (usersQuantity == 0 && postsQuantity > 0) {
            setUsersQuantity(statistics.usersNames().size());
            setPostsQuantity(statistics.postsCount());
            setCommentsQuantity(statistics.commentsCount());
            setAvaragePostsPerUser(0);
            setAvarageCommentsPerUser(0);
            setAvarageCommentsPerPost(commentsQuantity / postsQuantity);
        } else if (usersQuantity > 0 && postsQuantity == 0) {

            setUsersQuantity(statistics.usersNames().size());
            setPostsQuantity(statistics.postsCount());
            setCommentsQuantity(statistics.commentsCount());
            setAvaragePostsPerUser(0);
            setAvarageCommentsPerUser(commentsQuantity / usersQuantity);
            setAvarageCommentsPerPost(0);
        } else if (usersQuantity == 0 && postsQuantity == 0) {
            setUsersQuantity(statistics.usersNames().size());
            setPostsQuantity(statistics.postsCount());
            setCommentsQuantity(statistics.commentsCount());
            setAvaragePostsPerUser(0);
            setAvarageCommentsPerUser(0);
            setAvarageCommentsPerPost(0);
        }





    }
public void showStatistics(){
        System.out.print("Forum statistics: " +
                "/n" + "liczba użytkowników: " + usersQuantity +
                "/n" + "liczba postów: " + postsQuantity +
                "/n" + "liczba komentarzy: " + commentsQuantity +
                "/n" + "średnia ilość postów użytkowników: " + avaragePostsPerUser +
                "/n" + "średnia ilość komentarzy użytkowników: "+ avarageCommentsPerUser +
                "/n" + "średnia ilość komentarzy pod postami: " + avarageCommentsPerPost );

}

}
