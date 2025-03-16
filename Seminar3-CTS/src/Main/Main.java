package Main;

import Clase.AutoritatePescuitLazy;
import Clase.Autoritate_Pescuit_Eager;
public class Main {
    public static void main(String[] args) {
        Autoritate_Pescuit_Eager autoritatePescuitEager = Autoritate_Pescuit_Eager.getInstance();
        autoritatePescuitEager.Concediaza(5);
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.setDenumire("ANpA");
        autoritatePescuitEager.setWebsite("ANpA.ro");
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.emiteAutorizatii("WTF");
        System.out.println(autoritatePescuitEager.toString());
        Autoritate_Pescuit_Eager autoritatePescuitEager2 = Autoritate_Pescuit_Eager.getInstance();
        autoritatePescuitEager2.emiteAutorizatii("TOP");
        System.out.println(autoritatePescuitEager2.toString());

        AutoritatePescuitLazy autoritatePescuitLazy = AutoritatePescuitLazy.getInstance("ANPA","ANPA.ro",7,80);
        System.out.println(autoritatePescuitLazy.toString());

        AutoritatePescuitLazy autoritatePescuitLazy2 = AutoritatePescuitLazy.getInstance("Paul","Paul.ro",8,90);
        autoritatePescuitLazy2.Concediaza(5);
        System.out.println(autoritatePescuitLazy2.toString());
    }
}

