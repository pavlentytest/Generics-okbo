package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Account<Integer,Double,String> acc1 = new Account<Integer,Double,String>(5675,(double)90000);

        Account<String,Integer,String > acc2 = new Account<String,Integer,String>("B23882",8999);

        ArrayList persons = new ArrayList();
        persons.add(123);  // 0
        persons.add("2335");  // 1
        persons.add(new Object());  //2

        int a = (int) persons.get(1);

        ArrayList<Integer> bbb = new ArrayList<>();
        bbb.add(100); // 0
        bbb.add(9); // 1
        //bbb.add("asdfadf");



    }
}
