package com.company.students;

import com.company.exceptions.SingExceptions;
import com.company.interfaces.ISinger;

/**
 * Created by Cosovanu Vasile on 10/27/2014.
 *
 * This is the class for a military student
 */
public class MilitaryStudent extends Student implements ISinger {

    private boolean isOfficer = false;

    public MilitaryStudent(String name) {
        super(name);
        checkIfOfficer();
    }

    private boolean checkIfOfficer(){
        return isOfficer;
    }

    @Override
    public boolean attendingCourse(String courseName) {
        return courseName != null && (courseName.startsWith("Mil"));
    }

    @Override
    public void sing() throws SingExceptions{
        if( getmName() == null ) {
            throw new SingExceptions("The name is null");
        }
        System.out.println(this.getmName() + " is singing the anthem");
    }


    public void setOfficer(boolean officer){
        isOfficer = officer;
    }
}
