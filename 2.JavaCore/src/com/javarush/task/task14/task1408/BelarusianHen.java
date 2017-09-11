package com.javarush.task.task14.task1408;

/**
 * Created by DKGraf on 16.07.2017.
 */
public class BelarusianHen extends Hen {
    private String country = "Belarus";
    public BelarusianHen() {
    }

    public int getCountOfEggsPerMonth() {
        return 17;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }


}
