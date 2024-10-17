public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Sudut = "+s.totalSudut(21));
        System.out.println("Sudut = "+s.totalSudut(23, 21));
        System.out.println("Keliling = "+s.keliling(6, 7, 8));
        System.out.println("Keliling = "+s.keliling(6, 7));
    }
}
