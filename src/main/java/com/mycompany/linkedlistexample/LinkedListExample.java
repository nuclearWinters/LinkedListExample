/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linkedlistexample;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Armando
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        while(true) {
            System.out.println("Introduce un nombre: ");
            Scanner codigo = new Scanner(System.in);
            String codigoString = codigo.next();
            list.add(codigoString);
            System.out.println("¿Desea continuar (Y/N)?: ");
            Scanner inputContinuar = new Scanner(System.in);
            String isYORN = inputContinuar.next();
            if (isYORN.equals("N")) {
                break;
            }
        }
        System.out.println("Escriba un nombre y verifique su indice: ");
        Scanner inputContinuar = new Scanner(System.in);
        String isYORN = inputContinuar.next();
        int indice = list.indexOf(isYORN);
        System.out.println("El indice es: " + indice);
    }
    
}
