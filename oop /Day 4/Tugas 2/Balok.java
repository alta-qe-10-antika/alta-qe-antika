public class Balok {
    int Panjang;
    int Lebar;
    int Tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        Panjang = panjang;
        Lebar = lebar;
        Tinggi = tinggi;
    }

    public int VolumeBalok() {
        return (this.Panjang * this.Lebar * this.Tinggi);
    }
}