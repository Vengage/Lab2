package com.company.Students;

/**
 * Created by Cosovanu Vasile on 10/27/2014.
 *
 * This is the abstract student class
 */
public abstract class Student {

    /* The name of the student */
    private String mName;

    /**
     * This is the default contructor
     * @param name The student name
     */
    public Student(String name){
        this.mName = name;
    }

    /**
     * This method must be overwritten by all the subclasses
     *
     * @param courseName The name of the course
     * @return  <code>True</code> if the student is attending the course
     */

    public abstract boolean attendingCourse(String courseName);

    /**
     * Sets the name of the student
     * @param name The student name
     */
    public void setmName(String name){
        this.mName = name;
    }

    /**
     * Gets the value of the students name
     * @return The students name
     */
    public String getmName(){
        return this.mName;
    }
}
