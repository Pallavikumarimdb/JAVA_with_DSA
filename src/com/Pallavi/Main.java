package com.Pallavi;
import java.util.Scanner;


public class Main {
    int numberOfArrays;
    String ArrayFromUser;
    Scanner Input = new Scanner(System.in);

    public int getNumberOfArraysFromUser() {
        return numberOfArrays;
    }

    public String getArrayFromUser() {
        return ArrayFromUser;
    }

    public void setNumberOfArraysFromUser(int numArray) {
        this.numberOfArrays = numArray;
    }

    public void setArrayFromUser(String array) {
        this.ArrayFromUser = array;

    }

    public void PrintTheOutput() {
        setNumberOfArraysFromUser(Input.nextInt());
        Input.nextLine();

        for (int k = 0; k < getNumberOfArraysFromUser(); k++) {
            setArrayFromUser(Input.nextLine());


            char[] StringToArray = getArrayFromUser().toCharArray();
            for (int j = 0; j < ArrayFromUser.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(StringToArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 1; j < ArrayFromUser.length(); j++) {
                if (j % 2 != 0) {
                    System.out.print(StringToArray[j]);
                }
            }

            System.out.println();
        }

    }


    public static void main(String[] args) {
        Main str=new Main();
        str. PrintTheOutput();

    }
}
