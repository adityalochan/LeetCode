package Interview;

public class SingletonExample {
    private static SingletonExample singletonExample=null;

    private SingletonExample(){
    }

    private static SingletonExample getInstance() {
        if(singletonExample == null) {
            System.out.println("Singleton Initialized");
            singletonExample = new SingletonExample();
        }
        return  singletonExample;
    }

    public static void main(String[] args) {
        // sout message should be displayed
        SingletonExample singletonExample1 = new SingletonExample();
        singletonExample1.getInstance();

        // sout message should NOT be displayed bcz its singleton
        SingletonExample singletonExample2 = new SingletonExample();
        singletonExample2.getInstance();
    }
}
