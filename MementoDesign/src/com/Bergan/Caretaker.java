package com.Bergan;

import java.util.Stack;

public class Caretaker {
    Stack<Cart.CartMemento> history =new Stack<>();

    public void save (Cart cart){
        history.push(cart.save());
    }

    public void revert(Cart cart)
    {
        if (!history.isEmpty())
            cart.revert(history.pop());
        else
            System.out.println("cannot UNDO");
    }
}
