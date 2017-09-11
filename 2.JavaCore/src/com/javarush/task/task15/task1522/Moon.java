package com.javarush.task.task15.task1522;

/**
 * Created by DKGraf on 18.07.2017.
 */
class Moon implements Planet {
    private static Moon instance;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null)
            instance = new Moon();
        return instance;
    }

}
