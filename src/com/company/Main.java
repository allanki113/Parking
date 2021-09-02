package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int slotNumber=0;slotNumber<100;slotNumber++) {
        System.out.println("Automatic Parking");
        System.out.println("Please select below options");
        System.out.println("1. Park");
        System.out.println("2. Leave");
        System.out.println("3. Get Slot Info");
        int input = scan.nextInt();
        Parking parking = new Parking(100);
            if (input == 1) {
                System.out.println("Generate token for car");
                System.out.println("Enter car num:");
                String carNum = scan.next();
                System.out.println("Enter car color:");
                String carColor = scan.next();
                Car car = new Car(carNum, carColor);
                parking.parkACar(car);
            }
            if (input == 3) {
                parking.tokenInfo();
            }
        }

    }
}
