package com.Bergan.theater;

import com.Bergan.Theater;
import com.Bergan.shows.ShowTime10_00;
import com.Bergan.shows.ShowTime10_15;

public class MajisticJaffna extends Theater {

    @Override
    protected void createShowTime() {
        showsList.add(new ShowTime10_00());
        showsList.add(new ShowTime10_15());
    }
}
