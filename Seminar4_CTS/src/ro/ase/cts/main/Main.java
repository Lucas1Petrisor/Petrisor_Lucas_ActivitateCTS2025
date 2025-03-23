package ro.ase.cts.main;

import ro.ase.cts.Factory.Factory;
import ro.ase.cts.Factory.TipuriSupe;
import ro.ase.cts.clase.Supa;

public class Main {
    public static void main(String[] arg){
         Factory factory = new Factory(300,3.5);
         Supa supa = factory.getSupa(TipuriSupe.LEGUME,"Bors, Legume",100);
         supa.preparareSupa();
         Supa supa1 = factory.getSupa(TipuriSupe.VITA,"Bors,Legume,Vita",5);
         supa1.preparareSupa();
         Supa supa2 = factory.getSupa(TipuriSupe.CIUPERCI,"Ciuperci,Cartofi,Bors",35);
         supa2.preparareSupa();
    }
}
