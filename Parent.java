class Parent {
    public int  x =5;
}

    class Child extends Parent {
       public int x =10;
        public void info(int x){
            System.out.println("Nilai x sebagai parameter =" + x);
            System.out.println("Data member x di class Child =" +this.x);
            System.out.println("Data member x di class Parent =" +super.x);
        }
    }

    class NilaiX {
        public static void main(String[] args) {
            Child tes =new Child();
            tes.info(20);
        }
    }
