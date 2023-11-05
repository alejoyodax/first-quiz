package org.velezreyes.quiz.question6;

public class VendingMachineImpl {

  public static VendingMachine getInstance() {
      //first create canned drinks to fill the vending machine
      CannedDrink scott_cola = new CannedDrink("ScottCola", true, 75,10);
      CannedDrink karen_tea = new CannedDrink("KarenTea", false, 100,10);
      
      // create vending machine with cannes inside
      CannedDrink[] stock = new CannedDrink[50];
      stock[0] = scott_cola;
      stock[1] = karen_tea;
      VendingMachine vm1 = new DrinkVendingMachine(stock);
      
      return vm1;
  }
}
