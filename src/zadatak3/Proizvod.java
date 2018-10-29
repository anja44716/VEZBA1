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
public abstract class Proizvod implements UporedivoPoCenama {
    protected String naziv;
    protected double cena;
    public Proizvod(String naziv, double cena){
        this.naziv = naziv;
        if(cena>0) this.cena = cena;
    }
    public boolean skupljeOd(UporedivoPoCenama p){
        Proizvod proizvod =(Proizvod)p;
        return cena>proizvod.cena;
    }
    public boolean jeftinijeOd(UporedivoPoCenama p){
        Proizvod proizvod=(Proizvod)p;
        return cena<proizvod.cena;
    }
    public String getNaziv(){
        return naziv;
    }
    public void setNaziv(String naziv){
        this.naziv=naziv;
    }
    public double getCena(){
        return cena;
    }
    public void setCena(double cena){
        if(cena>0) this.cena=cena;
    }
    public abstract String ToString();
}
