public class A {
    String var_a = "Variabel A";
    String var_b = "Variabel B";
    String var_c = "Variabel C";
    String var_d = "Variabel D";
    A (){
    System.out.println("Konstruktor A dijalankan");
    }
}

class B extends A{
B(){
System.out.println("Konstruktor B dijalankan");
var_a = "Var_a dari kelas B";
var_b = "Var_b dari kelas B";
}

public static void main(String args[]){
System.out.println("Objek A dibuat");
A aa = new A();
System.out.println("Menampilkan nama variabel obyek aa");
System.out.println(aa.var_a);
System.out.println(aa.var_b);
System.out.println(aa.var_c);
System.out.println(aa.var_d);

B bb = new B();
System.out.println("Menampilkan nama variabel obyek bb");
System.out.println(bb.var_a);
System.out.println(bb.var_b);
System.out.println(bb.var_c);
System.out.println(bb.var_d);
}
}
