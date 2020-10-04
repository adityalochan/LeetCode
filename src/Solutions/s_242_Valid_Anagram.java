package Solutions;

public class s_242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            for(int i=0; i< s.length(); i++){
                for(int j =-0; j<s.length();j++){
                    if(s.charAt(i) == t.charAt(j)){
                        t.replace(t.charAt(j),' ');
                    }
                }
            }
        }
        if(t.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        s_242_Valid_Anagram s = new s_242_Valid_Anagram();
        System.out.println(s.isAnagram("anagram","nagaram"));
    }
}
