package Solutions;

import Algorithm.practise;

public class wordPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practise p = new practise();
//		System.out.println(p.isPalindrome("aaba"));
	}

	public boolean isPalindrome(String word){
		int len= word.length();
		for(int i=0;i<len;i++)
		{
			int j=--len;
			if(word.charAt(i)!=word.charAt(j))
				{
				return false;
				}
		}
		return true;
		}
}
