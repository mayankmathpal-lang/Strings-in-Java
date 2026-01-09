
public class LaunchMutable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               StringBuilder sb1 = new StringBuilder();
               StringBuilder sb = new StringBuilder("Telusko");
               System.out.println(sb.capacity());    //Capcity is 23 instead of 
               StringBuilder sb2 = new StringBuilder();
              
               System.out.println(sb1.equals(sb2));  //False because the object method is written to compare the references but string class(immutable string) have overridden that method to compare the values of the string.
	}

}
