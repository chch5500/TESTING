/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.entorno;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chch5500
 */
public class TicketAppTest {

    public TicketAppTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of calculateTicketPrice method, of class TicketApp.
     */
    @org.junit.jupiter.api.Test
    public void testInvalidAge() {
        int edad = -1;
        int type = 1;
        TicketApp instance = new TicketApp();
        assertThrows(InvalidAge.class, () -> instance.calculateTicketPrice(type, edad));
        
    }

    @org.junit.jupiter.api.Test
    public void testInvalidType1() {
        int edad = 5;
        int type = -1;
        TicketApp instance = new TicketApp();
        assertThrows(InvalidType.class, () -> instance.calculateTicketPrice(type, edad));
    }

    @org.junit.jupiter.api.Test
    public void testInvalidType2() {
        int edad = 5;
        int type = 5;
        TicketApp instance = new TicketApp();
        assertThrows(InvalidType.class, () -> instance.calculateTicketPrice(type, edad));

    }

    @org.junit.jupiter.api.Test
    public void testNiño() throws InvalidAge, InvalidType {
        //DECLARE AGE AND TYPE
        int edad = 3;
        int type[] = new int[4];
        //PUT VALUES INT THE TYPE ARRAY
        type[0] = 1;
        type[1] = 2;
        type[2] = 3;
        type[3] = 4;

        double result[] = new double[4];
        //PUT VALUES IN THE RESULT ARRAY
        result[0] = 0;
        result[1] = 0;
        result[2] = 0;
        result[3] = 0;

        for (int i = 0; i < type.length; i++) {
            //FOR EVERY VALUE IN THE TYPE ARRAY WE DECLARE EXPRESULT TO RESULT[i]
            TicketApp instance = new TicketApp();
            double expResult = result[i];
            double resultado = instance.calculateTicketPrice(type[i], edad);
            assertEquals(expResult, resultado, 0);
        }

    }

    @org.junit.jupiter.api.Test
    public void testJoven() throws InvalidAge, InvalidType {
        //DECLARE AGE AND TYPE
        int edad = 11;
        int type[] = new int[4];
        //PUT VALUES INT THE TYPE ARRAY
        type[0] = 1;
        type[1] = 2;
        type[2] = 3;
        type[3] = 4;

        double result[] = new double[4];
        //PUT VALUES IN THE RESULT ARRAY
        result[0] = 45;
        result[1] = 37.5;
        result[2] = 30;
        result[3] = 22.5;

        for (int i = 0; i < type.length; i++) {
            //FOR EVERY VALUE IN THE TYPE ARRAY WE DECLARE EXPRESULT TO RESULT[i]
            TicketApp instance = new TicketApp();
            double expResult = result[i];
            double resultado = instance.calculateTicketPrice(type[i], edad);
            assertEquals(expResult, resultado, 0);

        }

    }

    @org.junit.jupiter.api.Test
    public void testAdulto() throws InvalidAge, InvalidType {
        //DECLARE AGE AND TYPE
        int edad = 59;
        int type[] = new int[4];
        //PUT VALUES INT THE TYPE ARRAY
        type[0] = 1;
        type[1] = 2;
        type[2] = 3;
        type[3] = 4;

        double result[] = new double[4];
        //PUT VALUES IN THE RESULT ARRAY
        result[0] = 60;
        result[1] = 50;
        result[2] = 40;
        result[3] = 30;

        for (int i = 0; i < type.length; i++) {
            //FOR EVERY VALUE IN THE TYPE ARRAY WE DECLARE EXPRESULT TO RESULT[i]
            TicketApp instance = new TicketApp();
            double expResult = result[i];
            double resultado = instance.calculateTicketPrice(type[i], edad);
            assertEquals(expResult, resultado, 0);
        }

    }

    @org.junit.jupiter.api.Test
    public void testSenior() throws InvalidAge, InvalidType {
        //DECLARE AGE AND TYPE
        int edad = 60;
        int type[] = new int[4];
        //PUT VALUES INT THE TYPE ARRAY
        type[0] = 1;
        type[1] = 2;
        type[2] = 3;
        type[3] = 4;

        double result[] = new double[4];
        //PUT VALUES IN THE RESULT ARRAY
        result[0] = 30;
        result[1] = 10;
        result[2] = 8;
        result[3] = 6;

        for (int i = 0; i < type.length; i++) {
            //FOR EVERY VALUE IN THE TYPE ARRAY WE DECLARE EXPRESULT TO RESULT[i]
            TicketApp instance = new TicketApp();
            double expResult = result[i];
            double resultado = instance.calculateTicketPrice(type[i], edad);
            assertEquals(expResult, resultado, 0);

        }

    }
    /**
     * @org.junit.jupiter.api.Test public void testcaso1() {
     * System.out.println("Test age 3 type 1"); int lugar = 1; int edad = 3;
     * TicketApp instance = new TicketApp(); double expResult = 0.0; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso2() {
     * System.out.println("calculateTicketPrice"); int lugar = 2; int edad = 3;
     * TicketApp instance = new TicketApp(); double expResult = 0.0; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso3() {
     * System.out.println("calculateTicketPrice"); int lugar = 3; int edad = 3;
     * TicketApp instance = new TicketApp(); double expResult = 0.0; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso4() {
     * System.out.println("calculateTicketPrice"); int lugar = 4; int edad = 3;
     * TicketApp instance = new TicketApp(); double expResult = 0.0; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso5() {
     * System.out.println("calculateTicketPrice"); int lugar = 1; int edad = 11;
     * TicketApp instance = new TicketApp(); double expResult = 45; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso6() {
     * System.out.println("calculateTicketPrice"); int lugar = 2; int edad = 11;
     * TicketApp instance = new TicketApp(); double expResult = 37.5; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso7() {
     * System.out.println("calculateTicketPrice"); int lugar = 3; int edad = 11;
     * TicketApp instance = new TicketApp(); double expResult = 30; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso8() {
     * System.out.println("calculateTicketPrice"); int lugar = 4; int edad = 11;
     * TicketApp instance = new TicketApp(); double expResult = 22.5; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso9() {
     * System.out.println("calculateTicketPrice"); int lugar = 1; int edad = 59;
     * TicketApp instance = new TicketApp(); double expResult = 60; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso10() {
     * System.out.println("calculateTicketPrice"); int lugar = 2; int edad = 59;
     * TicketApp instance = new TicketApp(); double expResult = 50; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso11() {
     * System.out.println("calculateTicketPrice"); int lugar = 3; int edad = 59;
     * TicketApp instance = new TicketApp(); double expResult = 40; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso12() {
     * System.out.println("calculateTicketPrice"); int lugar = 4; int edad = 59;
     * TicketApp instance = new TicketApp(); double expResult = 30; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso13() {
     * System.out.println("calculateTicketPrice"); int lugar = 1; int edad = 60;
     * TicketApp instance = new TicketApp(); double expResult = 30; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso14() {
     * System.out.println("calculateTicketPrice"); int lugar = 2; int edad = 60;
     * TicketApp instance = new TicketApp(); double expResult = 10; double
     * result = instance.calculateTicketPrice(lugar, edad);
     * assertEquals(expResult, result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso15() {
     * System.out.println("calculateTicketPrice"); int lugar = 3; int edad = 60;
     * TicketApp instance = new TicketApp(); double expResult = 8; double result
     * = instance.calculateTicketPrice(lugar, edad); assertEquals(expResult,
     * result, 0); }
     *
     * @org.junit.jupiter.api.Test public void testcaso16() {
     * System.out.println("calculateTicketPrice"); int lugar = 4; int edad = 60;
     * TicketApp instance = new TicketApp(); double expResult = 6; double result
     * = instance.calculateTicketPrice(lugar, edad); assertEquals(expResult,
     * result, 0); }
     */
}
