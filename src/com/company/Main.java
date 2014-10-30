/**
 * Created by Cosovanu Vasile 26/10/2014
 *
 * This is a class comment
 */


package com.company;


import com.company.Animals.Cow;
import com.company.Animals.Snake;
import com.company.Exceptions.SingExceptions;
import com.company.Exceptions.SpecialExceptions;
import com.company.Interfaces.IAdditionals;
import com.company.Interfaces.ISinger;
import com.company.Students.CivilStudent;
import com.company.Students.MilitaryStudent;
import com.company.Students.Student;

public class Main {

    /**
     * The entry point to the project
     *
     * @param args The arguments to the executable
     */

    public static void main(String[] args) {

//        ISinger militaryStudent = new MilitaryStudent("Jack");
//        Student civilStudent = new CivilStudent("John");
//
//        try {
//            System.out.println("Military student:");
//            militaryStudent.sing();
//        } catch (SingExceptions singExceptions) {
//            singExceptions.printStackTrace();
//        }
//
//        try {
//            System.out.println("Civil student:");
//            ((ISinger) civilStudent).sing();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        IAdditionals cow = new Cow(500,"brown");
        Snake snake = new Snake(50,"black");

        System.out.println("Cow: ");
        try {
            cow.isComestible();
        } catch (SpecialExceptions specialExceptions) {
            specialExceptions.printStackTrace();
        }

        System.out.println("Snake: ");
        try {
            snake.isAlive();
        } catch (SpecialExceptions specialExceptions) {
            specialExceptions.printStackTrace();
        }


    }
}
