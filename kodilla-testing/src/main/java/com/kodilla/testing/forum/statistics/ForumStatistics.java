package com.kodilla.testing.forum.statistics;


public class ForumStatistics {

    private static int usersQuantity;
    private static double postsQuantity;
    private static double commentsQuantity;
    private static double avaragePostsPerUser;
    private static double avarageCommentsPerUser;
    private static double avarageCommentsPerPost;


    public  void setUsersQuantity(int usersQuantity) {
        ForumStatistics.usersQuantity = usersQuantity;
    }

    public  void setPostsQuantity(double postsQuantity) {
        ForumStatistics.postsQuantity = postsQuantity;
    }

    public  void setCommentsQuantity(double commentsQuantity) {
        ForumStatistics.commentsQuantity = commentsQuantity;
    }

    public  void setAvaragePostsPerUser(double avaragePostsPerUser) {
        ForumStatistics.avaragePostsPerUser = (float) avaragePostsPerUser;
    }

    public  void setAvarageCommentsPerUser(double avarageCommentsPerUser) {
        ForumStatistics.avarageCommentsPerUser = avarageCommentsPerUser;
    }

    public  void setAvarageCommentsPerPost(double avarageCommentsPerPost) {
        ForumStatistics.avarageCommentsPerPost = avarageCommentsPerPost;
    }

    public  int getUsersQuantity() {
        return usersQuantity;
    }

    public  double getPostsQuantity() {
        return postsQuantity;
    }

    public  double getCommentsQuantity() {
        return commentsQuantity;
    }

    public  double getAvaragePostsPerUser() {
        return avaragePostsPerUser;
    }

    public  double getAvarageCommentsPerUser() {
        return avarageCommentsPerUser;
    }

    public  double getAvarageCommentsPerPost() {
        return avarageCommentsPerPost;
    }

    public  void calculateAdvStatistics(Statistics statistics) {
        setUsersQuantity(statistics.usersNames().size());
        setPostsQuantity(statistics.postsCount());
        setCommentsQuantity(statistics.commentsCount());
        if ((usersQuantity > 0) && (postsQuantity > 0)) {

            setAvaragePostsPerUser(postsQuantity / usersQuantity);
            setAvarageCommentsPerUser(commentsQuantity / usersQuantity);
            setAvarageCommentsPerPost(commentsQuantity / postsQuantity);
        } else if (usersQuantity == 0 && postsQuantity > 0) {

            setAvaragePostsPerUser(0);
            setAvarageCommentsPerUser(0);
            setAvarageCommentsPerPost(commentsQuantity / postsQuantity);
        } else if (usersQuantity > 0 && postsQuantity == 0) {


            setAvaragePostsPerUser(0);
            setAvarageCommentsPerUser(commentsQuantity / usersQuantity);
            setAvarageCommentsPerPost(0);
        } else if (usersQuantity == 0 && postsQuantity == 0) {

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
