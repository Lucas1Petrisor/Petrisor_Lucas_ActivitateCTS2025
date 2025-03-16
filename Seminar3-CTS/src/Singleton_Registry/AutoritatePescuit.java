package Singleton_Registry;

import Singleton_Registry.AutoritatePescuit;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {
    private String nume;
    private String website;
    private int nrAngajati;

    private static AutoritatePescuit instance = null;

    private AutoritatePescuit(String nume, String website, int nrAngajati) {
        this.nume = nume;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    public static AutoritatePescuit getInstance(){
        if(instance == null){
            instance = new AutoritatePescuit("Top","Top.ro",100);
        }
        return instance;
    }

    private static Map<String,Autorizatie> registry = new HashMap<>();

    public static Autorizatie emiteAutorizatie(String numePersoana){
        if(!registry.containsKey(numePersoana)){
            return registry.get(numePersoana);
        }else{
            registry.put(numePersoana, new Autorizatie(numePersoana, registry.size()+1, new Date().toString()));
        }
        return registry.get(numePersoana);
    }

    
}
