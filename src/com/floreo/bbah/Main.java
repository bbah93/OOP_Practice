package com.floreo.bbah;

public class Main {

    public static void main(String[] args) {
        Pie myPie = new Pie("Graham Cracker", "Apple", 12);

        String crust = myPie.getCrust();
        Pie thisPie = new Pie();

        myPie.setCrust("filo");



      //Pie.crust = "this crust";

        //Instance variable
        System.out.println(myPie.getCrust());
        //Static variable
        //System.out.println(Pie.getPieFilling());
    }
}
