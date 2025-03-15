/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author hp
 */
public class If3 {
 
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       /* Kamus */
       int a;
       Scanner masukan=new Scanner(System.in);
       /* Program */
       System.out.print ("Contoh IF tiga kasus \n");
       System.out.print ("Ketikkan suatu nilai integer :");
       a=masukan.nextInt();
       if (a > 0){
           System.out.println ("Nilai a positif "+ a);
        }else if (a == 0){
            System.out.println ("Nilai Nol "+ a);
        }else /* a > 0 */ {
           System.out.println ("Nilai a negatif "+ a); 
       }
       
   }
   
   } 

