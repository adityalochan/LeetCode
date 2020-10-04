package Solutions;

public class s_28_strStr {

	public int strStr(String haystack, String needle) {
		if(haystack.contains(needle))
			return haystack.indexOf(needle);
		else
			return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "hello";
		String needle = "ll";
		s_28_strStr s = new s_28_strStr();
		System.out.println(s.strStr(haystack, needle));
	}

}
