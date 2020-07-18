package ru.innopolis.university.mingaleev.homework_3_12;

public class Print {
    static void printing (){
        try{
            System.out.println("Hello, world!");
            throw new NullPointerException();
        } catch (NullPointerException e){
            System.out.println("Exception: " + e.getMessage());

        }
    }

    public static void main(String[] args) {
        printing();
    }
}

