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
public class Program {
    Riba r;
    KopnenaZivotinja z;
    Ptica p;
    public Program(){
    r= new Riba();
    r.setNaziv("Saran");
    r.setKontinent("Evropa");
    r.setStaniste("Voda");
    r.setJestiva(true);
    r.setSlatkovodna(true);
    r.setOpasna(false);
    z= new KopnenaZivotinja();
    z.setNaziv("Lav");
    z.setKontinent("Afrika");
    z.setStaniste("Prasuma");
    z.setJestiva(true);
    z.setJestiva(true);
    p=new Ptica();
    p.setNaziv("Patka");
    p.setKontinent("Svi");
    p.setStaniste("Supljine");
    p.setGradska(true);
    p.setJestiva(true);
    p.setOpasna(false);
    System.out.println("Zivotinja 1: ");
    r.izdajPodatke();
    System.out.println("Zivotinja 2: ");
    z.izdajPodatke();
    System.out.println("Zivotinja 3: ");
    p.izdajPodatke();
    }
    /*public static void main(String[] args){
        new Program();
    }*/
}
