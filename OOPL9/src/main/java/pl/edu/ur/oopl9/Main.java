/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.Arrays;
import java.util.Random;
public class Main {
 private static int i;
 
    /**
     * @param args the command line arguments
     * @param tab
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tab[] = new int [100];
        System.out.println("Losowanie");
             Random r = new Random();
        for(int i=0;i<100;i++)
        {
            tab[i]=r.nextInt();
            System.out.println(tab[i]);
        }
        System.out.println("Sortowanir");
         Arrays.sort(tab);
        for(int i=0;i<100;i++)
        {
            System.out.println(tab[i]);
        }
    }
    }
    

