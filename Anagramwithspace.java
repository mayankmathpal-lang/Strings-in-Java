import java.util.Arrays;

public class Anagramwithspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s1="a gentle Man" ;
           String s2="elegant Man";
           
           s1=s1.replace(" ", "");
           s2=s2.replace(" ", "");
           
           s1=s1.toLowerCase();
           s2=s2.toLowerCase();
                      
           char[] ch1=s1.toCharArray();
           char[] ch2=s2.toCharArray();
           
           Arrays.sort(ch1);
           Arrays.sort(ch2);
           
           
           if (Arrays.equals(ch1, ch2)) {
			System.out.println("its a palindrome");
		} else {
          System.out.println("its not a palindrome");
		}
           
	}

}
