package com.Bergan;

public abstract class Handler {
    //create handler object
    protected Handler successor;


    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract double applyTax(Invoice  invoice);

}
