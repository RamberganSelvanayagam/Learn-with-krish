package com.Bergan;

public class Series extends Entertainment {
    private int totalEpisode;

    public int getTotalEpisode() {
        return totalEpisode;
    }

    public void setTotalEpisode(int totalEpisode) {
        this.totalEpisode = totalEpisode;
    }

    @Override
    public String toString() {
        return "Series{" +
                "totalEpisode=" + totalEpisode +
                '}';
    }
}
