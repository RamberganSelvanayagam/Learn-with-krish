package com.Bergan;

import com.Bergan.theater.MajisticJaffna;
import com.Bergan.theater.Rajah1;
import com.Bergan.theater.RegalJaffna;
import com.Bergan.theater.Savoy;

public class TheatreFactory {
    public static Theater createTheatre(TheaterName theaterName){
        switch (theaterName)
        {
            case  RAJA:
                return new Rajah1();

            case MCJAFFNA:
                return new MajisticJaffna();
            case REGAL:
                return new RegalJaffna();
            case SAVOY:
                return new Savoy();
            default:
                return null;

        }
    }
}
