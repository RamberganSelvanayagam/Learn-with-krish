package com.Bergan;

public abstract class Entertainment implements Cloneable{
    private String Name;
    private int profit;

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String type) {
        this.Name = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
