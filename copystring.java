public class copystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s1="TELUSKO";
            String s2="";
            
            for (int i = 0; i<s1.length(); i++) {
				
            	s2= s2+s1.charAt(i);
           		
            }
            
            System.out.println("First String is: "+s1);
            System.out.println("Copy pf the string is: "+s2);
            
	}

}
