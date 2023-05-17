package com.niit.jdp;

public class SellingPriceOfAnITEM {
    public static void main(String[] args) {
        String itemName = "kaisabowl";
        double sellingPrice = 10.99;
        double revisedSellingPrice = (10.99*5/100);
        System.out.println("Revised Selling Price for Rounded Kaisa Bowl is $" + revisedSellingPrice);
    }
}
