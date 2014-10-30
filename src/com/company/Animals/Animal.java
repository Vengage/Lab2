package com.company.Animals;

/**
 * Created by Cosovanu Vasile on 10/31/2014.
 *
 * This is the abstract animal class
 */
public abstract class Animal {

    /* The mass of the animal */
    private Integer mMasa;

    /* The color of the animal */
    private String mCuloare;

    /**
     * This is the private contructor
     * @param mass The mass of the animal
     * @param color The color of the animal
     */
    public Animal(Integer mass, String color){
        this.mMasa = mass;
        this.mCuloare = color;
    }

    /**
     * This method mus be overwritten by all the subclasses
     *
     * @param answer If the animal is carnivore or not
     * @return <code>True</code> if the animal is carnivore
     *
     */
    public abstract boolean isCarnivore(String answer);

    /**
     * This method must be overwritten by all the subclasses
     *
     * @param answer If the animal is walking or crawling
     * @return <code>True</code> if the animal is on foot
     * and <code>False</code> if the animal is crawling
     *
     */
    public abstract boolean walksOnFoot(String answer);

    public String getmCuloare() {
        return mCuloare;
    }

    public void setmCuloare(String mCuloare) {
        this.mCuloare = mCuloare;
    }

    public Integer getmMasa() {
        return mMasa;
    }

    public void setmMasa(Integer mMasa) {
        this.mMasa = mMasa;
    }
}
