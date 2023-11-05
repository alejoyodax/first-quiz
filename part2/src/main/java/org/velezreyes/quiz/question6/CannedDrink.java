package org.velezreyes.quiz.question6;


public class CannedDrink implements Drink{
    public String name;
    public boolean isFizzy;
    public int cost;   // cost in cents of dollar
    public int quantityAvailable; //units of this canned drink available

    //constructor
    public CannedDrink(String name, boolean isFizzy, int cost, int quantityAvailable) {
        this.name = name;
        this.isFizzy = isFizzy;
        this.cost = cost;
        this.quantityAvailable = quantityAvailable;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFizzy() {
        return this.isFizzy;
    }
    
}
