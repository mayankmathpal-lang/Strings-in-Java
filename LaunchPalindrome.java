//WAP a program for palindrome.
public class LaunchPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="NITIN";
          String s2="";
          
          for (int i= s1.length()-1; i>=0; i--) {
			  s2=s2+s1.charAt(i);
			  
		}
          System.out.println(s2);
          if (s1.equals(s2)) {
			System.out.println("It is palindrome");
		} else {
             System.out.println("It is not a palindrome");
		}
	}

}
