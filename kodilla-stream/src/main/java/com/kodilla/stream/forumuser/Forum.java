package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {


    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(123,"Dylan Murphy", 'M',
                LocalDate.of(2003, 1,23),342));
        forumUsersList.add(new ForumUser(6754,"Phoebe Pearson", 'F',
                LocalDate.of(1970, 1,4),3));
        forumUsersList.add(new ForumUser(542,"Morgan Walsh", 'M',
                LocalDate.of(1989,4,27),0));
        forumUsersList.add(new ForumUser(987,"Aimee Murphy", 'F',
                LocalDate.of(1989,4,27),0));
        forumUsersList.add(new ForumUser(54,"Ryan Talley", 'M',
                LocalDate.of(1999,2,28),13));
        forumUsersList.add(new ForumUser(1231,"Madelynn Carson", 'F',
                LocalDate.of(1997,6,28),13));
        forumUsersList.add(new ForumUser(765,"Giancarlo Guerrero",'M',
                LocalDate.of(1999,2,28),13));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersList);
    }
}


