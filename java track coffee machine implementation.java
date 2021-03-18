package machine;
import java.util.Scanner;
import java.lang.Math;

public class CoffeeMachine {
   
    int waterHas = 400;
    int milkHas = 540;
    int beansHas = 120;
    int dispossalCupsHas = 9;
    int moneyHas = 550;
    
    public void buy() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeType = scanner.next();
            switch (coffeeType) {
                case "1":
                    if (waterHas >=250 && milkHas >= 0 && beansHas >= 16 && dispossalCupsHas >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        waterHas -= 250;
                        milkHas -= 0;
                        beansHas -= 16;
                        dispossalCupsHas -= 1;
                        moneyHas += 4;
                    } else if (waterHas < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milkHas < 0) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (beansHas < 16) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (dispossalCupsHas < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                    System.out.println("");
                    //System.out.println("The coffee machine has:\n"+ waterHas +" of water\n"+ milkHas +" of milk\n"+ beansHas +" of coffee beans\n"+ dispossalCupsHas +" of disposable cups\n"+ moneyHas +" of money");
                    break;
                case "2":
                    if (waterHas >=350 && milkHas >= 75 && beansHas >= 20 && dispossalCupsHas >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        waterHas -= 350;
                        milkHas -= 75;
                        beansHas -= 20;
                        dispossalCupsHas -= 1;
                        moneyHas += 7;
                    } else if (waterHas < 350) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milkHas < 75) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (beansHas < 20) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (dispossalCupsHas < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    } 
                    System.out.println("");
                    //System.out.println("The coffee machine has:\n"+ waterHas +" of water\n"+ milkHas +" of milk\n"+ beansHas +" of coffee beans\n"+ dispossalCupsHas +" of disposable cups\n"+ moneyHas +" of money");
                    break;
                case "3":
                    if (waterHas >=200 && milkHas >= 100 && beansHas >= 12 && dispossalCupsHas >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        waterHas -= 200;
                        milkHas -= 100;
                        beansHas -= 12;
                        dispossalCupsHas -= 1;
                        moneyHas += 6;
                    } else if (waterHas < 200) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milkHas < 100) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (beansHas < 12) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (dispossalCupsHas < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                    
                    System.out.println("");
                    //System.out.println("The coffee machine has:\n"+ waterHas +" of water\n"+ milkHas +" of milk\n"+ beansHas +" of coffee beans\n"+ dispossalCupsHas +" of disposable cups\n"+ moneyHas +" of money");
                    break;
                case "back":
                    break;
            }
        
    }
    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
            int waterQuantity = scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            int milkQuantity = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            int beansQuantity = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            int numOfCups = scanner.nextInt();
            
            waterHas += waterQuantity;
            milkHas += milkQuantity;
            beansHas += beansQuantity;
            dispossalCupsHas += numOfCups;
            
            System.out.println("");
            //System.out.println("The coffee machine has:\n"+(waterHas + waterQuantity)+" of water\n"+(milkHas + milkQuantity)+" of milk\n"+(beansHas + beansQuantity)+" of coffee beans\n"+(dispossalCupsHas + numOfCups)+" of disposable cups\n"+ moneyHas +" of money");
        
    }
    public void take() {
        System.out.println("I gave you $" + moneyHas);
            moneyHas = 0;
            System.out.println("");
    }
    public void remaining() {
        System.out.println("The coffee machine has:\n"+ waterHas +" of water\n"+ milkHas +" of milk\n"+ beansHas +" of coffee beans\n"+ dispossalCupsHas +" of disposable cups\n"+"$"+ moneyHas +" of money");
            System.out.println("");
        
    }
    
    public void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            System.out.println("");
            
            if (action.equals("buy")) { 
                buy();
            }else if (action.equals("fill")) {
                fill();
            } else if (action.equals("take")) {
                take();
            } else if (action.equals("remaining")) {
                remaining();
            } else if (action.equals("exit")) {
            break;
            }
            
        }   
    }
     public static void main(String[] args) {
        CoffeeMachine coffeeMaker = new CoffeeMachine();
        coffeeMaker.start();
        
    }
}