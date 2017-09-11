package com.javarush.task.task15.task1522;

/**
 * Created by DKGraf on 18.07.2017.
 */
class Earth implements Planet {
    private static Earth instance;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null)
            instance = new Earth();
        return instance;
    }
}
