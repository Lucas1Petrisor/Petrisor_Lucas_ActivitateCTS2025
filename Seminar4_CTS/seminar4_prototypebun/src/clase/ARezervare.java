package clase;

public abstract class ARezervare {
    protected String numeClient;
    protected String dataRezervarii;
    protected int nrPersoane;


    public ARezervare() {
        this.numeClient="TOp";
        this.dataRezervarii="invalid";
        this.nrPersoane=0;

    }

    public ARezervare(String numeClient, String dataRezervarii, int nrPersoane) {
        if(numeClient.length()>3){
            this.numeClient = numeClient;
        }else{
            this.numeClient="Necunoscut";
        }
        if(dataRezervarii.length()==13){
            this.dataRezervarii = dataRezervarii;
        }else {
            this.dataRezervarii="invalid";
        }
        if(nrPersoane>2) {
            this.nrPersoane = nrPersoane;
        }else{
            this.nrPersoane=2;
        }
    }

    public abstract ARezervare copiaza();

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ARezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", dataRezervarii='").append(dataRezervarii).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }
}
