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

    public void testCalculateAdvancedStatisticsForZeroPostsAvarageCommentsPerPost() {
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


    }

    @Test

    public void testCalculateAdvancedStatisticsForZeroPostsAvaragePostsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        userNames.add("Jan Kowalski");
        userNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 4;
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(posts/userNames.size(), forumStatistics.getAvaragePostsPerUser(), 0.0001);


    }
    @Test

    public void testCalculateAdvancedStatisticsForZeroPostsAvarageCommentsPerUser() {
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


        assertEquals(comments/usersNames.size(), getAvarageCommentsPerUser(), 0.0001);


    }

    @Test

    public void testCalculateAdvancedStatisticsForThousandPostsAvarageCommentsPerPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 4;
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(0.0, getAvarageCommentsPerPost(), 0.0001);


    }

    @Test

    public void testCalculateAdvancedStatisticsForThousandPostsAvaragePostsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 4;
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(500, getAvaragePostsPerUser(), 0.0001);


    }
    @Test

    public void testCalculateAdvancedStatisticsForThousandPostsAvarageCommentsPerUser() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersNames = new ArrayList<>();
            usersNames.add("Jan Kowalski");
            usersNames.add("Janusz Nosacz");
            Random randomInt = new Random();
            int comments = 4;
            int posts = 1000;
            when(statisticsMock.postsCount()).thenReturn(posts);
            when(statisticsMock.usersNames()).thenReturn(usersNames);
            when(statisticsMock.commentsCount()).thenReturn(comments);


            //When

            ForumStatistics forumStatistics = new ForumStatistics();
            calculateAdvStatistics(statisticsMock);


            //Then


        assertEquals(comments/usersNames.size(), getAvarageCommentsPerUser(), 0.0001);


    }
    @Test
    public void testCalculateAdvancedStatisticsForZeroCommentsAvarageCommentsPerPost() {
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


        assertEquals(0, getAvarageCommentsPerPost(), 0.0001);


    }

    @Test

    public void testCalculateAdvancedStatisticsForZeroCommentsAvaragePostsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments = 0;
        int posts = 40;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(20, getAvaragePostsPerUser(), 0.0001);


    }
    @Test

    public void testCalculateAdvancedStatisticsForZeroCommentsAvarageCommentsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Jan Kowalski");
        usersNames.add("Janusz Nosacz");
        Random randomInt = new Random();
        int comments =0;
        int posts = 4;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(comments);


        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        calculateAdvStatistics(statisticsMock);


        //Then


        assertEquals(0, getAvarageCommentsPerUser(), 0.0001);


    }

}
