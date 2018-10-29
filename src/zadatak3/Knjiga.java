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
public class Knjiga extends Proizvod{
    protected String autor;
    public Knjiga(String naziv, String autor, double cena){
        super(naziv, cena);
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }
    public String ToString(){
        return naziv+", "+autor+" - "+cena;
    }
}
