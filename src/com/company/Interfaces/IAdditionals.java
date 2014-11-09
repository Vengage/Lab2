package com.company.interfaces;

import com.company.exceptions.SpecialExceptions;

/**
 * Created by Cosovanu Vasile on 10/31/2014.
 *
 * This is the interface for all the animals that have this properties
 */
public interface IAdditionals {

    public void isComestible() throws SpecialExceptions;
    public void isAlive() throws SpecialExceptions;

}
