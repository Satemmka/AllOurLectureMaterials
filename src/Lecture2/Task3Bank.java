package Lecture2;

public class Task3Bank {

    int balance = 0;

    public void deposit(int depositAmount) {
        if (depositAmount >= 10000) {
            System.out.println("Need to register sum in VID");
        } else {
            balance = balance + depositAmount;

            System.out.println("You have deposited " + depositAmount + " euros");
        }
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount > 700) {
            System.out.println("Dally limit exceeded");
        } else {

            if (balance - withdrawAmount < 0) {
                System.out.println("You don't have enough money");

            } else {
                balance = balance - withdrawAmount;
                    System.out.println("You have withdrawn " + withdrawAmount + " euros");
                }
            }
        }

        public void checkBalance () {
            System.out.println("You have " + balance + " euros on your bank account");

        }


    }
