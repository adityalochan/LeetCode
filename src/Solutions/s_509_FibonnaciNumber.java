package Solutions;

public class s_509_FibonnaciNumber {

    public int fabonnaci(int f){
        if(f<=1){
            return f;
        }
        return fabonnaci(f-1)+fabonnaci(f-2);
    }

    public static void main(String[] args) {
        s_509_FibonnaciNumber s_509_fibonnaciNumber = new s_509_FibonnaciNumber();
        System.out.println(s_509_fibonnaciNumber.fabonnaci(8));
    }
}
