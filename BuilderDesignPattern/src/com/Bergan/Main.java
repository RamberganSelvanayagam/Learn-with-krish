package com.Bergan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Entertainment.Builder builder=new Entertainment.Builder(1500);
        Entertainment entertainment=builder.movies("thor").webSeries("money heist").build();
        System.out.println(entertainment);
    }
}
