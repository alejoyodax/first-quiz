package org.velezreyes.quiz.question6;

public class DrinkVendingMachine implements VendingMachine{

    protected int moneyInserted = 0;
    private CannedDrink[] availableDrinks;
    
    // constructor receives a instance of CanneDrink
    public DrinkVendingMachine(CannedDrink[] availableDrinks) {
        this.availableDrinks = availableDrinks;
    }
    
    @Override
    public void insertQuarter() {
        this.moneyInserted = this.moneyInserted + 25;
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        for(int i = 0; i <= this.availableDrinks.length - 1 ; i++ ){
            
            // if drink name exists in the machine
            if(this.availableDrinks[i] instanceof CannedDrink && name == this.availableDrinks[i].getName()) {
                
                // if money inserted is enough to buy the drink
                if(this.availableDrinks[i].cost <= this.moneyInserted){
                    this.moneyInserted = this.moneyInserted - this.availableDrinks[i].cost;
                    return new DispensedDrink(this.availableDrinks[i]);
                }
                // money inserted is not enough to buy the drink
                else {
                    throw new NotEnoughMoneyException();
                }
            }
        }
        throw new UnknownDrinkException();
                
                
                
    }
    
    
    
}
