package com.holidayassignments;
import java.util.ArrayList;

public class Assignment21 {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<Integer> saveEvenNumbers(int N) {
        list = new ArrayList<Integer>();

        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) list.add(i);
        }

        return list;
    }

    public ArrayList<Integer> printEvenNumbers() {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int item : list) {
            newList.add(item * 2);
            System.out.println(item * 2);
        }

        return newList;
    }

    public static void main(String[] args) {
        Assignment21 asg = new Assignment21();
        asg.saveEvenNumbers(10);
        asg.printEvenNumbers();


    }

}