package ru.innopolis.university.mingaleev.homework_3_12;

import java.util.Scanner;

public class Print2 {

    static void Name () throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();

        if (name.length()<=1)
            throw new Exception("Length of your name should be more than 1!");

    }

    public static void main(String[] args) {
        try{
            Name();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
