public class PersegiPanjang {
    public double Panjang;
    public double Lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.Panjang = panjang;
        this.Lebar = lebar;
    }

    public double hitungKeliling() {
        return (2 * Panjang) + (2 * Lebar);
    }

    public double hitungLuas() {
        return (this.Panjang * this.Lebar);

    }

}