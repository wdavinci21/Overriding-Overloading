public class Main {
    public static void main(String [] argv){
        System.out.println("Lingkaran");
        Lingkaran l = new Lingkaran(14);
        l.hitungLuas();
        l.hitungKeliling();
        l.tampilData(); 
        System.out.println("--------------------");
        
        Lingkaran l2 = new Lingkaran(28);
        l2.hitungLuas();
        l2.hitungKeliling();
        l2.tampilData(); 
        System.out.println("--------------------");
        
        System.out.println("Segitiga Sama Kaki");
        SegitigaSamaKaki sg = new SegitigaSamaKaki(8, 3);
        sg.hitungLuas();
        sg.hitungKeliling();
        sg.tampilData();
        System.out.println("--------------------");
        
        System.out.println("Segi Empat");
        SegiEmpat se = new SegiEmpat(5, 8);
        se.hitungLuas();
        se.hitungKeliling();
        se.hitungDiagonal();
        se.tampilData();
    }
}
