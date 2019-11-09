/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Postal;
import java.util.Scanner;
/**
 *
 * @author joshuadabejero
 */
public class Finder {
    Scanner in = new Scanner(System.in);
    public Postal[] setPostal(Postal[] postal, int[] AreaCode, String[] AreaName) {
        postal = new Postal[13];
        
        for (int i = 0; i < postal.length; i++) {
            postal[i] = new Postal();
            postal[i].Code = AreaCode[i];
            postal[i].Name = AreaName[i];
        }
        return postal;
    }
    
    public String getInput() {
        System.out.print("Input the area you want to know the postal code: ");
        return in.nextLine();
    }
    
    public Boolean isFound(Postal[] postal, String input) {
        Boolean toggle = false;
        for (int i = 0; i < postal.length; i++) {
            if (input.equals(postal[i].Name)) {
                toggle = true;
                break;
            }
            
        }
        return toggle;
    }
    
    public int getPostalCode(Postal[] postal, String input){
        int index = 0;
        for (int i = 0; i < postal.length; i++) {
            if (input.equals(postal[i].Name)){
                index = i;
                break;
            }
        }
        
        return postal[index].Code;
    }
    
}
