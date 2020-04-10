package com.floreo.bbah;

public class Pie {

    private String crust = "filo dough";
    private String pieFilling = "cherry";
    private int diameter = 12;

    public Pie(){
        this("Graham", "Blueberry", 10);
    }

    public Pie(String chefChoiceCrust, String chefChoiceFilling, int chefChoiceDiameter){
        crust = chefChoiceCrust;
        pieFilling = chefChoiceFilling;
        diameter = chefChoiceDiameter;
    }

    public String getCrust() {
        return crust;
    }

    public String getPieFilling() {
        return pieFilling;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setPieFilling(String pieFilling) {
        this.pieFilling = pieFilling;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void pieIsBaked() {
        System.out.println("I am a " + pieFilling + " pie!");
    }



}
