package com.kodilla.testing.forum.statistics;


public class ForumStatistics {

    private  int usersQuantity;
    private  double postsQuantity;
    private  double commentsQuantity;
    private  double avaragePostsPerUser;
    private  double avarageCommentsPerUser;
    private  double avarageCommentsPerPost;


    public void setUsersQuantity(int usersQuantity) {
        this.usersQuantity = usersQuantity;
    }

    public void setPostsQuantity(double postsQuantity) {
        this.postsQuantity = postsQuantity;
    }

    public void setCommentsQuantity(double commentsQuantity) {
        this.commentsQuantity = commentsQuantity;
    }

    public void setAvaragePostsPerUser(double avaragePostsPerUser) {
        this.avaragePostsPerUser = avaragePostsPerUser;
    }

    public void setAvarageCommentsPerUser(double avarageCommentsPerUser) {
        this.avarageCommentsPerUser = avarageCommentsPerUser;
    }

    public void setAvarageCommentsPerPost(double avarageCommentsPerPost) {
        this.avarageCommentsPerPost = avarageCommentsPerPost;
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
