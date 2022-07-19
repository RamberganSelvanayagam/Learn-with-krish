package com.Bergan;

public class BBT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.03);
        System.out.println("BBT Calculated");

        if(invoice.getAmount()>200 && invoice.getAmount()<=300.0)
        {
            return invoice.getTax();
        }
        else {
            return successor.applyTax(invoice);

        }
    }
}
