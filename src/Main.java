//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Declaring Variables
        int age = 25;
        double salary = 50000.0;
        String name = "John";


        //Loops

    //for loop example
    for (int i = 0; i < 5; i++) {
        System.out.println("Iteration: " + i);
    }

    //while loop example
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

    //do while loop example
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);

    //if statement example
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

    //if else statement example
        num = 7;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    //Nested If Else Statement Example
        if (age >= 18) {
            if (age < 21) {
                System.out.println("You're eligible but not for alcohol");
            } else {
                System.out.println("You're eligible for everything");
            }
        } else {
            System.out.println("You're not eligible");
        }

    //Nested If Else Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        
        }


}