package com.Bergan;

import java.util.ArrayList;
import java.util.List;

public abstract class Theater {
    protected List<Shows> showsList =new ArrayList<>();

    public Theater() {
        createShowTime();
    }

    protected abstract void createShowTime();


}
