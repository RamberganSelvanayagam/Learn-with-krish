package com.Bergan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Registry registry =new Registry();
        Series series=(Series) registry.getEntertainment("seriesType");
        System.out.println(series);
        System.out.println(series.getName());


        series.setName("moneyheiest");
        series.setTotalEpisode(6);
        System.out.println(series);
        System.out.println(series.getName());

        Series series1=(Series) registry.getEntertainment("seriesType");
        System.out.println(series1);
        System.out.println(series1.getName());


    }
}
