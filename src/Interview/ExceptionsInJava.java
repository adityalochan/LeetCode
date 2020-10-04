package Interview;

public class ExceptionsInJava {

    public void throwAnException(){
        int a = 1;
        try{
            System.out.println(1/0);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("caught in throwAnExceptionMethod ");
        }
    }


    public void exceptionFun(){
        try{
            throw new Exception("exception thrown");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void exceptionFun1() throws IllegalArgumentException{
        throw new IllegalArgumentException("throws Illegal argument exception");
    }

    public static void main(String[] args) {
        ExceptionsInJava exceptionsInJava = new ExceptionsInJava();
        exceptionsInJava.throwAnException();
        exceptionsInJava.exceptionFun();
        exceptionsInJava.exceptionFun1();
    }
}

