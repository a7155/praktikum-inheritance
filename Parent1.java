public class Parent1{
    protected String ParentName;
    public Parent1(){
    }
    Parent1 (String parentName){
    this.ParentName = parentName;
    System.out.println("Konstruktor parent");
    }
    }
    
    class Baby extends Parent1{
    String babyName;
    
    Baby (String babyName){
    super();
    this.babyName = babyName;
    System.out.println("Konstruktor baby");
    System.out.println(babyName);
    }
    
    public void Cry(){
    System.out.println("owek owek");
    }
    }
