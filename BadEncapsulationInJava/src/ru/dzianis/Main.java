package ru.dzianis;
import ru.dzianis.bean.Coin;
import ru.dzianis.action.CompareCoin;
public class Main {

    public static void main(String[] args) {
	    Coin firstCoin = new Coin();
        firstCoin.setDiameter(-0.11);
        firstCoin.setDiameter(0.12);
        firstCoin.setWeight(150);

	    Coin secondCoin = new Coin();
        secondCoin.setDiameter(0.21);
        secondCoin.setWeight(170);

        CompareCoin compare = new CompareCoin();
        compare.compareDiameter(firstCoin,secondCoin);


    }
}
