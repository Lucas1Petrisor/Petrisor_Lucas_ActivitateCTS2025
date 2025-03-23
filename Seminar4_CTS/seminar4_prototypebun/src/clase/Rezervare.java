package clase;

public class Rezervare extends ARezervare{

    public Rezervare() {
    }

    public Rezervare(String numeClient, String dataRezervarii, int nrPersoane) {
        super(numeClient, dataRezervarii, nrPersoane);
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervare=new Rezervare();

        rezervare.numeClient=this.numeClient;
        rezervare.dataRezervarii=this.dataRezervarii;
        rezervare.nrPersoane=this.nrPersoane;

        return rezervare;
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o rezervare!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", dataRezervarii='").append(dataRezervarii).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }
}
