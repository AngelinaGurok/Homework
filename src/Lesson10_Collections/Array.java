package Lesson10_Collections;

import java.util.ArrayList;
import java.util.Scanner;
public class Array {
    private ArrayList<Double> arr;
    public Array(){ this.arr = new ArrayList<>();}
    //input values
    public void inputValues(){
        Scanner in = new Scanner(System.in);

        System.out.println("Input amount of elements you want to add: ");
        int amount = in.nextInt();
        double value;

        for(int i = 0; i < amount; i++){
            value = in.nextDouble();
            this.arr.add(value);
        }
    }
    public void centeringArray(){
        for(int i = 0; i < this.arr.size(); i++){
            this.arr.set(i, this.arr.get(i)/2);
        }
    }

    public void printArr(){
        if(this.arr.isEmpty()) return;

        for(int i = 0; i < this.arr.size(); i++){
            System.out.println(this.arr.get(i));
        }
        System.out.println("\n");
    }
}
