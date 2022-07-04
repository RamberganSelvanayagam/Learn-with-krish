package com.Bergan.theater;

import com.Bergan.Theater;
import com.Bergan.shows.ShowTime10_15;

public class Rajah1 extends Theater {

    @Override
    protected void createShowTime() {
        showsList.add(new ShowTime10_15());
    }
}
