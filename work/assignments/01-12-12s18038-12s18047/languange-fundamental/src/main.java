/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author 12-12s18038 Naomi Simatupang
 * @author 12-12s18047 Ulion Pardede
 */
 
import java.util.ArrayList;
import java.util.Scanner;
        
public class main {
   public static void main(String[] _args) {
    System.out.println("hello,world!");
    int gear = 1;
    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
        
    System.out.println(gear + "," +  "," + capitalC + "," + b);
        
    gear++;
    result = !result;
    capitalC += 4;
        
    System.out.println(gear + "," +  "," + capitalC + "," + b);
       
    //26 in hexadecimal and binary//
    int hexVal = 0x1a;
    int binVal = 0b11010;
      
    System.out.println(hexVal + "," + binVal);
        
        
    //intantiating and manipulating objects
    String name = "Wiro Sableng";
    short gearobject = 1;
    boolean resultobj = true;
        
    System.out.println(name + "," + gearobject + "," + resultobj);
      
    name = name.toUpperCase();
    gearobject++;
    resultobj = (result == false) || !resultobj;
    //array, collections, and loop
    ArrayList <ArrayList<Integer>> numbers =new ArrayList<ArrayList<Integer>>();
    System.out.println("Input Jumlah Data:");
    int jlh_data = new Scanner (System.in).nextInt();
    
    for (int i = 0; i < jlh_data; ++i) {
             numbers.add(new ArrayList<Integer>());
        for(int j =0;j<jlh_data;++j){
            numbers.get(i).add(i+j);
           } 
        }
    for (int i = 0; i < jlh_data; ++i) {
        for (int j = 0 ; j < jlh_data; ++j) { 
            System.out.print(numbers.get(i).get(j) + " ");
            }
            System.out.println();
        }
    
        
    }
    }

