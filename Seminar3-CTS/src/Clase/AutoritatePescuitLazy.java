package Clase;

public class AutoritatePescuitLazy {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitLazy instance = null;

    private AutoritatePescuitLazy(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static synchronized AutoritatePescuitLazy getInstance(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise){
        if(instance == null) {
            instance = new AutoritatePescuitLazy(denumire,website, nrAngajati, nrAutorizatiiEmise);
        }
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
        final StringBuilder sb = new StringBuilder("AutoritatePescuitLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
