public class main10 {
    public static void main(String[] args) {
        int a, b = 1, sonuc = 0;
        for (int i = 0; i < 20; i++) {
            a = b;
            b = sonuc;
            sonuc = a + b;
            System.out.println (sonuc);

        }
    }
}
