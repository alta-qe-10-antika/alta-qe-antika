public class Segitiga {
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double HitungLuas() {
        return (this.alas*this.tinggi/2);
    }
    public double HitungKeliling() {
        double a = Math.pow(this.alas,2);
        double b = Math.pow(this.tinggi,4);
        double sisi = Math.sqrt(a+b);
        return (this.alas+this.tinggi+sisi);


    }
}
