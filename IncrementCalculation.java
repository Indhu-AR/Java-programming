package practice;

import java.util.Scanner;

public class IncrementCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary");
        double salary = sc.nextDouble();

        System.out.println("Enter the Performance appraisal rating");
        double rating = sc.nextDouble();

        if (salary <= 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid Input");
        } 
        else if (rating >= 1 && rating <= 3) {
            salary = salary + (salary * 0.10);
            System.out.println((int)salary);
        } 
        else if (rating >= 3.1 && rating <= 4) {
            salary = salary + (salary * 0.25);
            System.out.println((int)salary);
        } 
        else if (rating >= 4.1 && rating <= 5) {
            salary = salary + (salary * 0.30);
            System.out.println((int)salary);
        }

        sc.close();
    }
}