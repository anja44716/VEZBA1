/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Anja
 */
public class UcitavanjeSaTastature {
    public static void UcitajIIspisiBrojRecenica(){
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    try{
        System.out.print("Unesite tekst: ");
        String s = br.readLine();
        int brojac = 0;
        for (int i=0; i<s.length(); i++)
            if(s.charAt(i)=='.' || s.charAt(i)=='?' || s.charAt(i)=='!')
                brojac++;
        System.out.println("Broj recenica u tekstu je: "+brojac);
    }
    catch(Exception e)
    {
        System.out.println("Greska: "+e.getMessage());
    }
    }
}
