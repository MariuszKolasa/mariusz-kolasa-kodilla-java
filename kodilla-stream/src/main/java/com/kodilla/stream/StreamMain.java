package com.kodilla.stream;



import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamMain {
    public static void main(String[] args) {
        Forum userList = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers =
                userList.getUserList().stream()
                        .filter(x -> (LocalDate.now().compareTo( x.getDateOfBirth())) >= 20)
                        .filter(x -> x.getUserSex() == 'M')
                        .collect(Collectors.toMap(ForumUser::getUserID, x -> x));

        resultMapOfUsers.entrySet().stream()
                .forEach(System.out::println);
    }

}