/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

/**
 *
 * @author Anja
 */
public class Pribor extends Proizvod {
    protected String proizvodjac;
    public Pribor(String naziv, String proizvodjac, double cena){
        super(naziv, cena);
        this.proizvodjac=proizvodjac;
    }
    public String getProizvodjac(){
        return proizvodjac;
    }
    public String ToString(){
        return naziv+", "+proizvodjac+" - "+cena;
    }
}
