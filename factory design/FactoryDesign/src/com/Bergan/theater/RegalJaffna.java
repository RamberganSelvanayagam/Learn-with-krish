package com.Bergan.theater;

import com.Bergan.Theater;
import com.Bergan.shows.ShowTime10_00;

public class RegalJaffna extends Theater {

    @Override
    protected void createShowTime() {
        showsList.add(new ShowTime10_00());
        showsList.add(new ShowTime10_00());
    }
}
