package Solutions;

import org.junit.Assert;
import org.junit.Test;

public class s_1119_RemoveVowelFromAString {

    public String removeVowel(String S){
       StringBuilder stringBuilder = new StringBuilder();
       S.toLowerCase();
       for(char character : S.toCharArray()){
           if(character =='a' || character =='e' || character =='i' || character =='o' || character =='u' ){
               stringBuilder.append("");
           }else {
               stringBuilder.append(character);
           }
       }
        return stringBuilder.toString();
    }

    @Test
    public void test(){
        s_1119_RemoveVowelFromAString s_1119 = new s_1119_RemoveVowelFromAString();
        Assert.assertEquals("ltcdscmmntyfrcdrs",s_1119.removeVowel("leetcodeisacommunityforcoders"));
    }
}
