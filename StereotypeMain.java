public class StereotypeMain {
    public static void main(String[] args) {
        Manusia m = new Manusia();
        Dosen d = new Dosen();
        Mahasiswa h = new Mahasiswa();

        System.out.println("MANUSIA");
        m.bernafas();
        m.makan();
        System.out.println("\nDOSEN");
        m = d;
        m.bernafas();
        m.makan();
        d.lembur();  
        System.out.println("\nMAHASISWA");
        m = h;
        m.bernafas();
        m.makan();
        h.tidur();
    }
}
