/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.Finder;
import model.Postal;
/**
 *
 * @author joshuadabejero
 */
public class Terminal {
    public static void main(String[] args) {
        int[] AreaCode = {4608, 4607, 4600, 4610, 4606, 4604, 4601, 4605, 4609, 4611, 4602, 4612, 4603};
        String[] AreaName = {"Basud", "Capalonga", "Daet", "Imelda", "Jose Panganiban", "Labo", "Mercedez", "Paracale"
                            , "San Vicente", "Sta. Elena", "Talisay", "Tulay Na Lupa", "Vinzons"};
        
        Finder finder = new Finder();
        Postal[] postal = new Postal[13];
        
        postal = finder.setPostal(postal, AreaCode, AreaName);
        
        String input = new String();
        input = finder.getInput();
        
        while (finder.isFound(postal, input) == false) {
            input = finder.getInput();
        }
        
        System.out.println("Your zipcode is " + finder.getPostalCode(postal, input));
    }
}
