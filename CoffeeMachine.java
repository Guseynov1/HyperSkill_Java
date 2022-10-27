package CoffeeMachine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {

    public static int initialWater = 400;
    public static int initialMilk = 540;
    public static int initialBeans = 120;
    public static int initialCups = 9;
    public static int initialMoney = 550;

    public static void exit(){
        Scanner scanner = new Scanner(System.in);
        String exit = scanner.nextLine();
        if (Objects.equals(exit, "exit")) System.exit(0);
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String name = scanner.next();
            if (name.equals("exit")){
                break;
            } else switch (name){
                case "buy" -> buy();
                case "fill" -> fill();
                case  "take" -> take();
                case "remaining" -> remaining();
            }

        }

    }
    public static void buy(){
        int cCups = 1;
        // espresso
        int eWater = 250;
        int eBeans = 16;
        int eCosts = 4;
        // latte
        int lWater = 350;
        int lMilk = 75;
        int lBeans = 20;
        int lCosts = 7;
        // cappuccino
        int cWater = 200;
        int cMilk = 100;
        int cBeans = 12;
        int cCosts = 6;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        int buy = scanner.nextInt();
        if (initialWater < eWater | initialWater < lWater | initialWater < cWater) System.out.println("Sorry, not enough water!");
        else if (initialBeans < eBeans | initialBeans < lBeans | initialBeans < cBeans) System.out.println("Sorry, not enough beans!");
        else if (initialMilk < lMilk | initialMilk < cMilk) System.out.println("Sorry, not enough milk!");
        else switch (buy) {
                case 1 -> System.out.println("The coffee machine has:\n" +
                            (initialWater - eWater) + " ml of water\n" +
                            initialMilk + " ml of milk\n" + (initialBeans - eBeans) + " ml of coffee beans\n" +
                            (initialCups - cCups) + " disposable cups\n" + "$" + (initialMoney + eCosts) + " of money");

                case 2 -> System.out.println("The coffee machine has:\n" + (initialWater - lWater) + " ml of water\n" +
                        (initialMilk - lMilk) + " ml of milk\n" + (initialBeans - lBeans) + " ml of coffee beans\n" +
                        (initialCups - cCups) + " disposable cups\n" + "$" + (initialMoney + lCosts) + " of money");

                case 3 -> System.out.println("The coffee machine has:\n" + (initialWater - cWater) + " ml of water\n" +
                        (initialMilk - cMilk) + " ml of milk\n" + (initialBeans - cBeans) + " ml of coffee beans\n" +
                        (initialCups - cCups) + " disposable cups\n" + "$" + (initialMoney + cCosts) + " of money");

                default -> System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            }
        scanner.close();
    }
    public static void fill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = scanner.nextInt();
        System.out.println("\nThe coffee machine has:\n" + (initialWater + addWater) + " ml of water\n" +
                (initialMilk + addMilk) + " ml of milk\n" + (initialBeans + addBeans) + " g of coffee beans\n" +
                (initialCups + addCups) + " disposable cups\n" + "$" + initialMoney + " of money\n");
        scanner.close();
    }
    public static void take(){
        System.out.println("I gave you " + "$" + initialMoney);
        System.out.println("\nThe coffee machine has:\n" + initialWater + " ml of water\n" +
                initialMilk + " ml of milk\n" + initialBeans + " g of coffee beans\n" +
                initialCups + " disposable cups\n" + "$" + 0 + " of money\n");
    }
    public static void remaining() {
        int cCups = 1;
        // espresso
        int eWater = 250;
        int eBeans = 16;
        int eCosts = 4;
        // latte
        int lWater = 350;
        int lMilk = 75;
        int lBeans = 20;
        int lCosts = 7;
        // cappuccino
        int cWater = 200;
        int cMilk = 100;
        int cBeans = 12;
        int cCosts = 6;
        System.out.println("""

                The coffee machine has:
                400 ml of water
                540 ml of milk
                120 g of coffee beans
                9 disposable cups
                $550 of money""");
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        Scanner scanner = new Scanner(System.in);
        if ("buy".equals(scanner.nextLine())) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            int buy = scanner.nextInt();
            if (initialWater < eWater | initialWater < lWater | initialWater < cWater)
                System.out.println("Sorry, not enough water!");
            else if (initialBeans < eBeans | initialBeans < lBeans | initialBeans < cBeans)
                System.out.println("Sorry, not enough beans!");
            else if (initialMilk < lMilk | initialMilk < cMilk) System.out.println("Sorry, not enough milk!");
            else switch (buy) {
                    case 1, 2, 3 -> System.out.println("I have enough resources, making you a coffee!\n\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

                    default ->
                            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

                }
            scanner.close();
        }
    }












}
