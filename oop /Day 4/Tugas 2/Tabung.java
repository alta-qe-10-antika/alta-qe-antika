public class Tabung {

    double JariJari;
    double Tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.JariJari = jariJari;
        this.Tinggi = tinggi;
    }
    public double VolumeTabung(){
        return (Math.PI + (this.JariJari*this.JariJari)*this.Tinggi);

    }
}