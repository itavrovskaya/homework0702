package com.company;

public class Main {

    public static void main(String[] args) {
    int[] weight = new int[3];
    weight[0] = 1;
    weight[1] = 2;
    weight[2] = 3;
    System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);
        System.out.println();
        System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);
        System.out.println();
        System.out.println((weight[0]+1) + ", " + weight[1] + ", " + (weight[2]+1));
        System.out.println();


    float[] weights = {1.57f, 7.654f, 9.986f};
    for (int i = 2; i < 3; i++) {
        System.out.println(weights[0] + ", " + weights[1] + ", " + weights[i]);
        }
    System.out.println();
        for (int i = 2; i > 1; i--) {
            System.out.println(weights[i] + ", " + weights[1] + ", " + weights[0]);
        }
        System.out.println();

    int[] birds = {3, 4, 2, 7, 1};
    int mondayBirds = birds[0];
    int tuesdayBirds = birds[1];
    int wednesdayBirds = birds[2];
    int thursdayBirds = birds[3];
    int fridayBirds = birds[4];
        System.out.println(mondayBirds + ", " + tuesdayBirds + ", " + wednesdayBirds + ", " + thursdayBirds + ", " + fridayBirds);
        System.out.println();
        System.out.println(fridayBirds + ", " + thursdayBirds + ", " + wednesdayBirds + ", " + tuesdayBirds + ", " + mondayBirds);
    }
}
