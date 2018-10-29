/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;
import java.util.ArrayList;
/**
 *
 * @author Anja
 */
public class Prodaja {
    public static void main(String[] args){
        ArrayList<Proizvod> p=new ArrayList<Proizvod>();
        p.add((Proizvod)(new Knjiga("Kandze","Vidojkovic",700)));
        p.add((Proizvod)(new Knjiga("Trijmufalna kapija","Remark",650)));
        p.add((Proizvod)(new Knjiga("Tri ratna druga","Remark",850)));
        p.add((Proizvod)(new Pribor("penkala","Parker",550)));
        p.add((Proizvod)(new Pribor("kalkulator","Casio",1150)));
        p.add((Proizvod)(new Knjiga("Noc u Lisabonu","Remark",500)));
        for(int i=0;i<p.size();i++){
            for(int j=i+1; j<p.size();j++)
                if(p.get(j).jeftinijeOd(p.get(i))){
                    Proizvod pom=p.get(i);
                    p.set(i, p.get(j));
                    p.set(j, pom);
                }
        }
        for(int i =0; i<p.size();i++){
            if(p.get(i) instanceof Knjiga){
            Knjiga knjiga = (Knjiga)p.get(i);
            System.out.println(knjiga.ToString());
            }
            else if(p.get(i) instanceof Pribor){
            Pribor pribor=(Pribor)p.get(i);
            System.out.println(pribor.ToString());
            }
        }
    }
}
