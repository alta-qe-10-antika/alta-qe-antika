public class Main {
    public static void main(String[] args) {
        System.out.println("ANTIKA");
        System.out.println(" ");


        System.out.println("===KUBUS===");
        Kubus kubus = new Kubus(10);
        System.out.println(" Volume kubus adalah: "+ kubus.VolumeKubus());
        System.out.println(" ");

        System.out.println("===BALOK===");
        Balok balok = new Balok(3, 6, 10);
        System.out.println(" Volume balok adalah: "+ balok.VolumeBalok());
        System.out.println(" ");

        System.out.println("===TABUNG===");
        Tabung tabung = new Tabung(7, 10);
        System.out.println(" Volume Tabung adalah: " + tabung.VolumeTabung());
        System.out.println(" ");

    }
}