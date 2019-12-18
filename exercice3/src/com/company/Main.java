
/*
 * Date 28/11/2019 14:41
 * Createur : Marvin RENOIR
 * File : Main.java
 * project : exercice3
 */
package com.company;

public class Main {

    public static void main(String[] args) throws ZeroDivExeception {
        String[] array = {"203", "404", "a", "15", "18", "20"};
        double average = AverageArray(array);
        System.out.println("Moyenne :  " + average);
    }

    private static double AverageArray(String[] array) throws ZeroDivExeception {
        double result = 0;
        double value = 0;
        int count = 0;
        for (String s : array) {
            try {
                value = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.print(e.getMessage() + "\n");
                value = 0;
                count--;
                System.out.println("La valeur est une lettre ... \n");
                throw new ZeroDivExeception("Methode AverageArray ");

            } finally {
                result += value;
                count++;

            }
        }
        try {
            result /= count;
        } catch (Exception e) {
            throw new ZeroDivExeception("Division par 0");
        }
        return result;
    }
}
