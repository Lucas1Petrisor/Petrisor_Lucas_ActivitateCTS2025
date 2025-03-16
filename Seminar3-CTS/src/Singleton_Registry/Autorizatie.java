package Singleton_Registry;

public class Autorizatie {
    private String Detinator;
    private int idAutorizatie;
    private String data;

    public Autorizatie(String detinator, int idAutorizatie, String data) {
        Detinator = detinator;
        this.idAutorizatie = idAutorizatie;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autorizatie{");
        sb.append("Detinator='").append(Detinator).append('\'');
        sb.append(", idAutorizatie=").append(idAutorizatie);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
