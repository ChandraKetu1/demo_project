package package_1;

public class Test_3 {
  public static void main(String arg []){
    int org=123;
    int reverse=0;
    while(org>0){
      int rem=org%10;
      reverse=reverse*10+rem;
      org=org/10;
    }
    System.out.println("Reverse no :"+reverse);
  }

}
