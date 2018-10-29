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
public class Riba extends Animal {
    protected boolean slatkovodna;
    protected boolean jestiva;
    protected boolean opasna;
    
    public Riba(){
        vrsta = "Riba";
    }
    public boolean isSlatkovodna(){
        return slatkovodna;
    }
    public void setSlatkovodna(boolean slatkovodna) {
        this.slatkovodna = slatkovodna;
    }
    public boolean isJestiva(){
        return jestiva;
    }
    public void setJestiva(boolean jestiva){
        this.jestiva = jestiva;
    }
    public boolean isOpasna(){
        return opasna;
    }
    public void setOpasna(boolean opasna){
        this.opasna=opasna;
    }
    public void izdajPodatke(){
        super.izdajPodatke();
        if(slatkovodna)
            System.out.println("Slatkovodna");
        else
            System.out.println("Morska");
        if(!jestiva)
            System.out.println("Nije ");
        System.out.println("jestiva");
        if(!opasna)
            System.out.println("Nije ");
        System.out.println("opasna");
    }
}
