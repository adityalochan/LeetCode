package Solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDrivenDevelopment {
    s_125_ValidPalindrome validPalindrome;
    @Before
    public void setup(){
        validPalindrome = new s_125_ValidPalindrome();
    }

    @Test
    public void isPalindromeTest(){
//        s125_ValidPalindrome validPalindrome = new s125_ValidPalindrome();
        validPalindrome.palindrome("aba");
//        Assert.assertEquals("101",validPalindrome.palindrome("101"));
        System.out.println(validPalindrome.palindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void staircaseTest(){

        validPalindrome.staircase(5);

        String a;
        int val = 3;
        a = (val==3) ? "done":"pending";
    }

}
