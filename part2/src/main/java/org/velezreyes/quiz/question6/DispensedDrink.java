package org.velezreyes.quiz.question6;

public class DispensedDrink implements Drink{
    public String name;
    public boolean isFizzy;

    public DispensedDrink(CannedDrink dispensedDrink) {
        this.name = dispensedDrink.name;
        this.isFizzy = dispensedDrink.isFizzy;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFizzy() {
        return isFizzy;
    }
    
}
