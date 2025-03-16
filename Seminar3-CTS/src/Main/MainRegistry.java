package Main;


import Singleton_Registry.AutoritatePescuit;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit =AutoritatePescuit.getInstance();
        System.out.println(autoritatePescuit.toString());

    }
}
