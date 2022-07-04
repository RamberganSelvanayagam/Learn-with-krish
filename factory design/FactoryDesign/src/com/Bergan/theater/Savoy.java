package com.Bergan.theater;

import com.Bergan.Theater;
import com.Bergan.shows.ShowTime10_00;

public class Savoy extends Theater {

    @Override
    protected void createShowTime() {
        showsList.add(new ShowTime10_00());
    }
}
