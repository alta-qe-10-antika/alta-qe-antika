public class Persegi {
    public double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double HitungKeliling(){
        return (2*sisi);
    }
    public double hitungLuas(){
        return (this.sisi*this.sisi);
    }
}