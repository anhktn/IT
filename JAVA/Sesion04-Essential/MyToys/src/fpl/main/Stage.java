/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpl.main;

import fpl.util.MyToys;

/**
 *
 * @author NGOC ANH
 */
public class Stage {

    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        // MyToys.PI = 4.0;
        System.out.println("PI again: " + MyToys.PI);

        int n = MyToys.getAnInteger();
        System.out.println("n: " + n);

        int choice;
        choice = MyToys.getAnInteger("Moi nhap lua chon cua ban (1..7): ");
        System.out.println("Lua chon cua ban la: " + choice);
        
    }

}
