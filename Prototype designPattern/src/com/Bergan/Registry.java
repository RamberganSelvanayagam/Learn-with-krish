package com.Bergan;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String,Entertainment> entertainmentMap =new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Entertainment getEntertainment(String funType)
    {
        Entertainment entertainment=null;
        try {
             entertainment=(Entertainment) entertainmentMap.get(funType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return entertainment;
    }

    private void initialize() {
        Series series =new Series();
        series.setProfit(200000);
        series.setTotalEpisode(31);
        series.setName("thor");
        entertainmentMap.put("seriesType",series);

        Movie movie =new Movie();
        movie.setProfit(77000);
        movie.setName("Family");
        movie.setDuration(120);
        entertainmentMap.put("seriesType",series);


       // entertainmentMap.put(EntertainmentType.Movie,movie);
       // entertainmentMap.put(EntertainmentType.Series,series);
    }
}
