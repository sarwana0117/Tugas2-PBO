/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Konstant {
   
public static void main(String[] args) {
   // TODO Auto-generated method stub
   /* Kamus */
        final float PHI = 3.1415f;
        float r;
        Scanner masukan=new Scanner(System.in);
    /* program */ /* baca data */
       
       System.out.print ("Jari-jari lingkaran =");
       r = masukan.nextFloat();
    /* Hitung dan tulis hasil */
       System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
       System.out.print ("Akhir program \n");
       
}    
}
