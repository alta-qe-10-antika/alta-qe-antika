public class Harga {
    public int dimensiBarang(int p, int l, int t){
        int result = p * l * t;
        int finalResult;
        if (result < 50){
            finalResult = 50;
        } else{
            finalResult = result;
        }
        return finalResult;
    }
    public int TinggiBarang(int Berat){
        int result = Berat*5000;
        int finalResult;
        if (Berat<1) {
            Berat = 1;
        }
        return result;
    }
}
