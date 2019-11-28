
/*
 * Date 28/11/2019 14:41
 * Createur : Marvin RENOIR
 * File : Main.java
 * project : exercice3
 */


package com.company;

public class Main {

    public static void main(String[] args) throws ExceptionIsNumber, ZeroDivExeception {
        String[] array = {"123", "456", "a"};
        double average = AverageArray(array);
        System.out.println("Moyenne :  " + average);
    }

    private static double AverageArray(String[] array) throws ExceptionIsNumber, ZeroDivExeception {
        double result = 0;
        double value = 0;
        int count = 0;
        for (String s : array) {
            try {
                value = Double.parseDouble(s);
            } catch (NumberFormatException e) {
//                e.getMessage();
                value = 0;
                count--;
                throw new ExceptionIsNumber("Cette valeur n'est pas un nombre ! ");
            }
            result += value;
            count++;
        }
        try {
            result /= count;
        } catch (Exception e) {
            throw new ZeroDivExeception("Division par 0");
        }
        return result;
    }
}
