/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author Monika
 */


import java.util.Iterator;

import java.util.Random;

import java.util.TreeSet;

public class Zadanie2 {


    public static void main(String[] args) {

        int a;


        Random losujLiczby = new Random();

        TreeSet x = new TreeSet <> ();


        for(int i = 0; i < 100; i++)

            {

                a = losujLiczby.nextInt(101);

                x.add(a);

            }


        Iterator it = x.iterator();


        while (it.hasNext())

           {

         System.out.println(it.next() + " ");

            }

    }
}