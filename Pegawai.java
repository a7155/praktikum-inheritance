public class Pegawai {
    protected String nama="";
    protected double gaji=0.0;

public Pegawai(String name, double gaji){
    this.nama=name;
    this.gaji=gaji;
} 
}

    class Manager extends Pegawai{
    public String departemen;
    public Manager(String nama,double gaji,String dep){
        super(nama,gaji);
        departemen=dep;
        }

    public void IsiData (String n, String d){
        super.nama=n;
        departemen=d;
    }
    
}

class tesManager {
    public static void main(String[] args) {
    final Manager Utama = new Manager(null, 0, null);
    System.out.println("Name:"+ Utama);
    System.out.println("Salary:"+ Utama);
    System.out.println("Department:"+ Utama);

    }
    }