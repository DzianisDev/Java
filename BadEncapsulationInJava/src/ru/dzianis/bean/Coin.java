package ru.dzianis.bean;

public class Coin {
    private double diameter; //encapsulation violation #FIX
    private double weight; //correct encapsulation

    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double value){
        if(value > 0){
            diameter = value;
        }else{
            System.out.println("Negative diameter!");
        }
    }
    public double getWeight(){ //incorrect method name #FIX
        return weight;
    }
    public void setWeight(double value){
        weight = value;
    }
}
