package com.kodilla.testing.forum.statistics;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.kodilla.testing.forum.statistics.ForumStatistics.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuit {




    @Test

    public void testCalculateAdvancedStatisticsForZeroPostsUsersQuantity() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 4;
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then
        assertEquals(2, getUsersQuantity());


    }

    @Test

    public void testCalculateAdvancedStatisticsForZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 4;
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(0.0, getAvarageCommentsPerPost(), 0.0001);
        assertEquals(0, getAvaragePostsPerUser(), 0.0001);
        assertEquals(2, getAvarageCommentsPerUser(), 0.0001);
    }



    @Test

    public void testCalculateAdvancedStatisticsForThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments= 5;
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(0.005, forumStatistics.getAvarageCommentsPerPost(), 0.0001);
        assertEquals(500, getAvaragePostsPerUser(), 0.0001);
        assertEquals(2.50, getAvarageCommentsPerUser(), 0.0001);

    }


    @Test
    public void testCalculateAdvancedStatisticsForZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 0;
        int posts = 4;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(0.0, getAvarageCommentsPerPost(), 0.0001);
        assertEquals(2, getAvaragePostsPerUser(), 0.0001);
        assertEquals(0, getAvarageCommentsPerUser(), 0.0001);

    }
    @Test
    public void testCalculateAdvancedStatisticsForMorePostsThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 2;
        int posts = 4;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(0.5, getAvarageCommentsPerPost(), 0.0001);
        assertEquals(2, getAvaragePostsPerUser(), 0.0001);
        assertEquals(1, getAvarageCommentsPerUser(), 0.0001);

    }
    @Test
    public void testCalculateAdvancedStatisticsForMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 6;
        int posts = 4;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(1.5, getAvarageCommentsPerPost(), 0.0001);
        assertEquals(2, getAvaragePostsPerUser(), 0.0001);
        assertEquals(3, getAvarageCommentsPerUser(), 0.0001);

    }
    @Test
    public void testCalculateAdvancedStatisticsForZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();



        int comments = 4;
        int posts = 4;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(1.0, getAvarageCommentsPerPost(), 0.0001);
        assertEquals(0, getAvaragePostsPerUser(), 0.0001);
        assertEquals(0, getAvarageCommentsPerUser(), 0.0001);

    }
    @Test
    public void testCalculateAdvancedStatisticsForHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int n=1 ; n<=100 ;n++){
            usersNames.add("user" + n);
        }


        int comments = 4;
        int posts = 4;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(1.0, getAvarageCommentsPerPost(), 0.0001);
        assertEquals(0.04, getAvaragePostsPerUser(), 0.0001);
        assertEquals(0.04, getAvarageCommentsPerUser(), 0.0001);

    }
}
