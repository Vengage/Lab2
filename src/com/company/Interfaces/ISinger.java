package com.company.interfaces;

import com.company.exceptions.SingExceptions;

/**
 * Created by Cosovanu Vasile on 10/27/2014.
 *
 * This is the interface for all the people that are goins to sing in the anthem
 *
 */
public interface ISinger {

    /**
     * This is the singing method
     */
    public void sing () throws SingExceptions;
}
