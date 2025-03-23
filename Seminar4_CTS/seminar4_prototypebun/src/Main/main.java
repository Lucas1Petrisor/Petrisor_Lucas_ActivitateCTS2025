package Main;

import clase.ARezervare;
import clase.Rezervare;

public class main {
    public static void main(String[] args) {
        ARezervare aRezervare = new Rezervare("Lucas", "10.03.2025/20", 5);

        ARezervare rezervare1=aRezervare.copiaza();

        System.out.println(rezervare1.toString());

        ARezervare rezervare2 =aRezervare.copiaza();

        System.out.println(rezervare2.toString());
    }
}
