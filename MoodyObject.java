public class MoodyObject {
    protected String getMood(){
        return "moody";
    }

    public void speake(){
        System.out.println("i am " +getMood());
    }

    void laugh(){

    }

    void cry(){

    }
}

    class SadObject extends MoodyObject{
    protected String getMood(){
        return "sad";
    }

    public void cry(){
        System.out.println("Hoo hoo");
    }
    
}

    class HappyObject extends MoodyObject{
    protected String getMood(){
        return "Happy";
    }
    public void laugh(){
        System.out.println("Hahahaha");
    }
}

    class MoodyTest{
    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        //test parent class
        m.speake();
        //test inheritance class
        m  = new HappyObject();
        m.speake();
        m.laugh();
        //test inheritance calss
        m = new SadObject();
        m.speake();
        m.cry();
        
    }
}