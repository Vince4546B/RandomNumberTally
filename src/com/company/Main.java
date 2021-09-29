package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many sides does your dice have?");
        int sideNum = input.nextInt();

        System.out.println("How many times do you want to throw the dice.");
        int throwNum = input.nextInt();
        for (int i = 0; i < throwNum; i++) {
            int min = 1;
            int max = sideNum;
            int newRandom = random.nextInt((max - min)+1) + min;
            System.out.println("Roll is" + " " + newRandom);

        }
    }
}
