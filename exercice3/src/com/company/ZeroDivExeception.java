
/*
 * Date 28/11/2019 14:41
 * Createur : Marvin RENOIR
 * File : ZeroDivExeception.java
 * project : exercice3
 */

package com.company;

public class ZeroDivExeception extends Throwable {
    ZeroDivExeception(String s) {
        System.out.print(s);
    }
}
