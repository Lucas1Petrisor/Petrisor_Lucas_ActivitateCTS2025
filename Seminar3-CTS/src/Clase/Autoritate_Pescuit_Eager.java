package Clase;

public class Autoritate_Pescuit_Eager {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static Autoritate_Pescuit_Eager instance = new Autoritate_Pescuit_Eager("ANPA","ANPA.ro",10,10);

    private Autoritate_Pescuit_Eager(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static Autoritate_Pescuit_Eager getInstance(){
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void Angajeaza(int nrAngajati){
        this.nrAngajati += nrAngajati;
    }

    public void Concediaza(int nrAngajati){
        this.nrAngajati-=nrAngajati;
    }

    public void emiteAutorizatii(String numePersoana){
        System.out.println("A fost emisa autorizatia pentru: "+ numePersoana);
        this.nrAutorizatiiEmise++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autoritate_Pescuit_Eager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
