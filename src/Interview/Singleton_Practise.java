package Interview;

public class Singleton_Practise {
    private static Singleton_Practise singleton_practise = null;

    private Singleton_Practise(){
    }


    public Singleton_Practise getInstance(){
        if(singleton_practise ==null){
            System.out.println("singleton initialized");
            singleton_practise = new Singleton_Practise();
        }
         return singleton_practise;
    }

    public static void main(String[] args) {
        Singleton_Practise singleton_practise = new Singleton_Practise();
    }
}
