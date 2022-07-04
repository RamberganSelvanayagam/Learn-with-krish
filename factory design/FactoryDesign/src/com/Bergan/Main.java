package com.Bergan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theater theater=TheatreFactory.createTheatre(TheaterName.MCJAFFNA);
        System.out.println(theater.showsList);
    }
}
