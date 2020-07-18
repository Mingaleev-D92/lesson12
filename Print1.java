package ru.innopolis.university.mingaleev.homework_3_12;

public class Print1 {
    public static void putPrint(String[] putPrint) {
        try{
            putPrint[6] = "Print";
            System.out.println(putPrint[6]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceptional situation: " + exception.getMessage());
        }
        System.out.println("Normal continuation");
    }

    public static void main(String[] args) {
        String[] refrigerator = {"Printer", "Suner", "Copier", "Fax"};
        putPrint(refrigerator);
    }
}
