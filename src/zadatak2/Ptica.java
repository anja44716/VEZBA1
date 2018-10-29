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
public class Ptica extends Animal {
    protected boolean gradska;
    protected boolean jestiva;
    protected boolean opasna;
    public Ptica(){
        vrsta="Ptica";
    }
    public boolean isGradska(){
        return gradska;
    }
    public void setGradska(boolean gradska){
        this.gradska=gradska;
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
        if(gradska)
            System.out.println("Gradska");
        else
            System.out.println("Zivi u divljini");
        if(!jestiva)
            System.out.println("Nije ");
        System.out.println("jestiva");
        if(!opasna)
            System.out.println("Nije ");
        System.out.println("opasna");
    }
}
