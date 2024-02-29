/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

import java.util.Scanner;
public class Main {

    // Finished 2-28
    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();
        // call the compute() method on that new object
        main.compute();
    }

    public void compute() {
        // Get input string of name from user
        System.out.println("Please enter your name");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.nextLine();

        // Create conditional to check name against Alice and Bob
        if(name.equalsIgnoreCase("alice") || name.equalsIgnoreCase("bob")){
            // Print greeting to screen if Alice or Bob are true
            System.out.println("Hi, " + name);
        }
        else{
            // Print "You are neither Alice nor Bob." otherwise
            System.out.println("You are neither Alice nor Bob");
        }



    }
}
