package com.company.Students;

/**
 * Created by venga_000 on 10/27/2014.
 *
 * This is the class for a military student
 *
 */
public class MilitaryStudent extends Student {

    public MilitaryStudent() {
        super("");
    }

    @Override
    public boolean attendingCourse(String courseName) {
        return false;
    }

}
