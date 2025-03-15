/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class PrintXWhile {

public static void main(String[] args) {
    int Sum;
    int x;
    Scanner masukan=new Scanner (System.in);
    Sum = 0;
    
    System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
    x = masukan.nextInt();/* First Elmt*/
    while (x != 999) /* Kondisi berhenti */ {
        Sum = Sum + x; /* Proses */
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();/* First Elmt*/
    }
    System.out.println("Hasil penjumlahan = "+ Sum); 
    
}    
}
