package Lecture3;

public class SampleSwitch {
    public static void main(String[] args) {
        String drink = "coffee";
        switch (drink){
            case "milk":
                System.out.println("i will drink Milk");
                break;
            case "tea":
            case "teacup":
            case "coffee":
            case "sugar":

                System.out.println("i will drink Coffee");
                break;

            default:
                System.out.println("Say what???");


        }
    }
}
