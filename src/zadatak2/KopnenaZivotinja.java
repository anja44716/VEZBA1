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
public class KopnenaZivotinja extends Animal {
    protected boolean planinska;
    protected boolean jestiva;
    protected boolean opasna;
    public KopnenaZivotinja(){
        vrsta="Kopnena zivotinja";
    }
    public boolean isPlaninska(){
        return planinska;
    }
    public void setPlaninska(){
        this.planinska=planinska;
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
        if(planinska)
            System.out.println("Planinska");
        else
            System.out.println("Ravnicarska");
        if(!jestiva)
            System.out.println("Nije ");
        System.out.println("jestiva");
        if(!opasna)
            System.out.println("Nije ");
        System.out.println("opasna");
    }
}
