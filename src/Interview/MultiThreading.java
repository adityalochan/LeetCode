package Interview;

public class MultiThreading implements Runnable{
    private String threadName;
    private  Thread t;
    public MultiThreading(String threadName){

        this.threadName = threadName;
    }

    @Override
    public void run() {
        int i =1;
        while(i < 10){
            System.out.println("Thread name ::"+ threadName);
            i++;
            try {
                t.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
    }

    public static void main(String[] args) {
        MultiThreading multiThreading = new MultiThreading("THREAD 1");
        multiThreading.start();

        multiThreading = new MultiThreading("THREAD 2");
        multiThreading.start();
    }
}
