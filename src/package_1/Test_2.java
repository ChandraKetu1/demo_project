package package_1;

public class Test_2 {
	public static void main(String[] args) {
		String input="chandra";
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		System.out.println("REVERSE STRING :" +rev);
	}

}
