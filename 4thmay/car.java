//"Program to store the information of the car (Name, Model, Year of Purchase, Purchase price). Price of the car is depreciated 10% every year. And minimum resale price should 20% of the purchase price. Write a method to calculate the resale price of the car in the provided year.
For eg, 
Car purchased in 2017 by 1000000 rs
Resale price in 2018 will be 900000 rs
Resale price in 2019 will be 8,10,000 rs"

import java.util.*;
public class Car {
	public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter car name: ");
        String carName = in.next();
        
        System.out.println("Enter model: ");
        String model = in.next();
        
        System.out.println("Enter year: ");
        int year = in.nextInt();
        
        System.out.println("Enter price: ");
        double price = in.nextDouble();
        
        System.out.println("Car Name:"+ carName);
        System.out.println("Model:"+ model);
        System.out.println("Year:"+ year);
        System.out.println("Price:"+ price);
               
        System.out.println("1. One year old car");
        System.out.println("2. Two year old car");
        System.out.println("3. Three year old car");
        System.out.println("4. Four year old car");
        System.out.println("5. More than four year old car");
        
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        
        if (choice < 1 || choice > 5) {
            System.out.println("Wrong choice! Please select from 1, 2, 3, 4, 5.");
            return;
        }
double depValue = 0.0;
        
        switch(choice) {
            case 1:
                depValue = 0.1 * price;
                break;
            
            case 2:
                depValue = 0.2 * price;
                break;
            
            case 3:
                depValue = 0.3 * price;
                break;
            
            case 4:
                depValue = 0.5 * price;
                break;
            
            case 5:
                depValue = 0.6 * price;
                break;
            
            default:
                System.out.println("Wrong choice! Please select from 1, 2, 3, 4, 5.");
                break;
        }
        
        double amtPayable = price - depValue;
        
        System.out.println("Original Price = " + price);
        System.out.println("Depricated Value = " + depValue);
        System.out.println("Amount to be paid = " + amtPayable);
    }


}
