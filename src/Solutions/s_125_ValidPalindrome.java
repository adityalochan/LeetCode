package Solutions;

public class s_125_ValidPalindrome {

    public String palindrome(String str){
        StringBuilder builder = new StringBuilder();
        for(char character : str.toCharArray()){
            if(Character.isLetterOrDigit(character)){
                builder.append(character);
            }
        }
        return builder.reverse().toString();
    }


    public void staircase(int length){
        for(int i=length;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
