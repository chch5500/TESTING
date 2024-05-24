/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entorno;

/**
 *
 * @author chch5500
 */
public class TicketApp {
    /**
     * MAIN FOR INSTANCE TICKETAPP AND DO CALCULATE PRICE
     * @param args
     * @throws InvalidAge
     * @throws InvalidType 
     */
    public static void main(String[] args) throws InvalidAge, InvalidType {
        TicketApp myApp = new TicketApp();
        double price = myApp.calculateTicketPrice(1, 11);
        System.out.println(price);
    }

    /**
     * METHOD FOR CALCULATE THE PRICE OF THE TICKET USING TYPE AND AGE
     * @param lugar tipo de entrada
     * @param edad edad del comprador
     * @return precio de la entrada
     * @throws InvalidAge
     * @throws InvalidType 
     */
    public double calculateTicketPrice(int lugar, int edad) throws InvalidAge, InvalidType {
        double price = 0;
        //WE MADE THE SWITCH CASE FOR EVERY CASE
        switch (lugar) {
            case 1:
                //IF ELSE FOR EVERY AGE RANGE
                if (edad < 0) {
                    //IF AGE IS LOWER THAN 0, THEN THROW THE EXCEPTION
                    throw new InvalidAge();
                } else if (edad < 4) {
                    return price = 0;
                } else if (edad < 12 && edad >= 4) {
                    return price = 45;
                } else if (edad < 60 && edad >= 12) {
                    return price = 60;
                } else if (edad >= 60) {
                    return price = 30;
                }
                break;
            case 2:
                if (edad < 0) {
                    throw new InvalidAge();
                } else if (edad < 4) {
                    return price = 0;
                } else if (edad < 12 && edad >= 4) {
                    return price = 37.5;
                } else if (edad < 60 && edad >= 12) {
                    return price = 50;
                } else if (edad >= 60) {
                    return price = 10;
                }
                break;
            case 3:
                if (edad < 0) {
                    throw new InvalidAge();
                } else if (edad < 4) {
                    return price = 0;
                } else if (edad < 12 && edad >= 4) {
                    return price = 30;
                } else if (edad < 60 && edad >= 12) {
                    return price = 40;
                } else if (edad >= 60) {
                    return price = 8;
                }
                break;
            case 4:
                if (edad < 0) {
                    throw new InvalidAge();
                } else if (edad < 4) {
                    return price = 0;
                } else if (edad < 12 && edad >= 4) {
                    return price = 22.5;
                } else if (edad < 60 && edad >= 12) {
                    return price = 30;
                } else if (edad >= 60) {
                    return price = 6;
                }
                break;
                //IF THE TYPE VALUE DOES NOT MATCH WITH ANY CASE, IT THROWS THE EXCEPTION
            default:
                throw new InvalidType();
        }
        return -1;
    }
}
