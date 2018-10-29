/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

/**
 *
 * @author Anja
 */
public class Animal implements Ianimal {
    protected String vrsta;
    protected String naziv;
    protected String kontinent;
    protected String staniste;
    
    public Animal(){
        
    }
    public String getNaziv(){
        return naziv;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public String getKontinent(){
        return kontinent;
    }
    public void setKontinent(String kontinent){
        this.kontinent = kontinent;
    }
    public String getStaniste(){
        return staniste;
    }
    public void setStaniste(String staniste){
        this.staniste = staniste;
    }
    public void izdajPodatke(){
        System.out.println("Vrsta:"+vrsta);
        System.out.println("Naziv:"+naziv);
        System.out.println("Kontinent:"+kontinent);
        System.out.println("Staniste:"+staniste);
    }
}
