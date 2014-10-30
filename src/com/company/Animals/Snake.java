package com.company.Animals;

import com.company.Exceptions.SpecialExceptions;
import com.company.Interfaces.IAdditionals;

/**
 * Created by Cosovanu Vasile on 10/31/2014.
 *
 * This is the class for snake
 */
public class Snake extends Animal implements IAdditionals{

    public Snake(Integer mass, String color){
        super(mass,color);
    }

    @Override
    public boolean isCarnivore(String answer) {
        return answer.contentEquals("yes");
    }

    @Override
    public boolean walksOnFoot(String answer){
        return answer.contentEquals("false");
    }

    @Override
    public void isComestible() throws SpecialExceptions {
        if(getmMasa() == null){
            throw new SpecialExceptions("The snake doesn't have mass!");
        }
        System.out.println("The type of snake is comestible!");
    }

    @Override
    public void isAlive() throws SpecialExceptions{
        if(getmMasa() == null){
            throw new SpecialExceptions("The snake doesn't have mass!");
        }
        System.out.println("Is dead!");
    }
}