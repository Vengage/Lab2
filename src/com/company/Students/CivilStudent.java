package com.company.students;

import com.company.interfaces.ISinger;

/**
 * Created by Cosovanu Vasile on 10/27/2014.
 *
 * This is the class for a civil student
 *
 */

public class CivilStudent extends Student implements ISinger{

    public CivilStudent(String name){
        super(name);
    }

    @Override
    public boolean attendingCourse(String courseName){
        return courseName!=null && (courseName.startsWith("Mil"));
    }

    @Override
    public void sing(){
        System.out.println(this.getmName() + " is singing the anthem.");
    }

}
