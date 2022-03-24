package ru.dzianis;
import ru.dzianis.bean.Coin;
public class Main {

    public static void main(String[] args) {
	    Coin coin = new Coin();
        coin.diameter = -0.12; //incorrect: direct access--> ob.setWeight(100);
        //coin.weight = -150; //field is not available: compile
    }
}
