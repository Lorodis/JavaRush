package com.javarush.task.task15.task1522;

/**
 * Created by DKGraf on 18.07.2017.
 */
class Sun implements Planet {
    private static Sun instance;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null)
            instance = new Sun();
        return instance;
    }
}
