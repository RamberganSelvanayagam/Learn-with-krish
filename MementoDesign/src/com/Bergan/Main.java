package com.Bergan;

public class Main {

    public static void main(String[] args) {
        Caretaker caretaker=new Caretaker();
        Cart cart=new Cart();

        System.out.println("your Movies Selections are");

        cart.addMovie(new Movie("Thor"));
        cart.addMovie(new Movie("Money Heiest"));
        caretaker.save(cart);
        System.out.println(cart);

        cart.addMovie(new Movie("Boys"));
        caretaker.save(cart);
        System.out.println(cart);

        cart.addMovie(new Movie("Loki"));
        caretaker.save(cart);
        System.out.println(cart);

        cart.addMovie(new Movie("Avengers"));
        System.out.println(cart);

        caretaker.revert(cart);
        System.out.println(cart);

        caretaker.revert(cart);
        System.out.println(cart);

        caretaker.revert(cart);
        System.out.println(cart);

        caretaker.revert(cart);
        System.out.println(cart);
        cart.addMovie(new Movie("FF10"));
        System.out.println(cart);




    }
}
