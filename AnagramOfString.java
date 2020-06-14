package strings;

public class AnagramOfString {

	public static void main(String[] args) {


		String a="aab";
		String b="abc";
		boolean isAnagram = false;
		
		boolean visited[]=new boolean[b.length()];
		if(a.length()==b.length()) { //a check on the length if the length matches you enter the loop
			
		
		
		for(int i=0;i<a.length();i++  ) {
			char c=a.charAt(i);
			isAnagram=false;
			
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)==c && !visited[j]) { //visited check 
					visited[j]= true; //already visited character needs a recheck iif they are same in both a&b
					isAnagram= true;
					break;
				}
				
			}
			if(!isAnagram) {
				break;
				
			}
			
		}
		
	}
		
		if(isAnagram) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not an anagram");
		}

	}

}
