/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class PrintWhile1 {
 
public static void main(String[] args) {
    int N;
    int i = 1;
    Scanner masukan=new Scanner(System.in);
    
    System.out.print ("Nilai N >0 = ");
    N = masukan.nextInt();
    System.out.print ("Print i dengan WHILE (ringkas): \n");
    while (i <= N){
       System.out.println (i++);     
    }/* (i > N)*/
}   
   
}
