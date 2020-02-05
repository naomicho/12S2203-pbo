/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languange.fundamental;

/**
 *
 * @author 12-12s18038 Naomi Simatupang
 * @author 12-12s18047 Ulion Pardede
 */
public class LanguangeFundamental {

    /*program empty point */
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
        int [][] numbers = new int [10][10];
        
        for (int i = 0; i < numbers.length; ++i) {
           for (int j = 0; j < numbers[1].length; ++j) {
               numbers[i][j] = i + j;
           } 
        }
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0 ; j < numbers[i].length; ++j) {
                System.out.print(numbers [i][j] + "");
            }
            System.out.println();
        }
    }

    

