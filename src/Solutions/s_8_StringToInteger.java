package Solutions;

public class s_8_StringToInteger {
    public int myAtoi(String str){
        int index = 0;
        int sign = 1;
        int sum =0;
//        Case 1 : string is empty
        if(str.isEmpty())
            return 0;
//        Case 2 : check for spaces
        while(str.charAt(index)==' ')
            index++;
//        Case 3 : checking for signs
        if(str.charAt(index)=='-') {
            sign = -1;index++;
        }
//        Case 4 : getting number and checking for max and min
        while(index <str.length()){
           int digit = str.charAt(index)-'0';
            if(digit < 0 | digit > 9)
                break;
            if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            sum = sum *10 + digit;
            index++;
        }
        return sum*sign;
    }
    public static void main(String[] args){
        s_8_StringToInteger s = new s_8_StringToInteger();
        System.out.println(s.myAtoi("-42"));
    }
}
