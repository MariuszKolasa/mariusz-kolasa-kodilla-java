package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        //name visible on forum
        this.name = name;
        //real name of the user
        this.realName = realName;
    }

    public void addPost(String postBody,String author ){
        ForumPost thePost= new ForumPost(postBody,author);
        posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody){
        ForumComment theComment=new ForumComment(thePost,author,commentBody );
        comments.add(theComment);
    }

    public int getPostsQuantity(){

        return posts.size();
    }

    public int getCommentsQuantity(){
        return comments.size();
    }

    public ForumPost getPost(int postNumber){
        ForumPost thePost=null;
        if(posts.size()!=0&&postNumber>=0&&postNumber< posts.size()){
          thePost =  posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if (comments.size() != 0 && commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPost thePost){
        if(posts.contains(thePost)) {
            posts.remove(thePost);
            return true;
        }else{
            return false;
        }
    }

    public boolean removeComment(ForumComment theComment){
        if(comments.contains(theComment)) {
            comments.remove(theComment);

            return true;
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}