package com.javarush.task.task14.task1408;

/**
 * Created by DKGraf on 16.07.2017.
 */
public class RussianHen extends Hen {
    private String country = "Russia";
    int getCountOfEggsPerMonth() {
        return 20;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
