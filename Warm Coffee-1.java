import java.util.Scanner;

class coffi {

    public static void main(String[] args)
 {

    String p;
    int a;
    double b;
    float c;
    char d;
    long e;
   
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter The String=");
    p = sc.nextLine();

    System.out.print("Enter The value=");
    a=sc.nextInt();

    System.out.print("Enter The value=");
    b=sc.nextDouble();

    System.out.print("Enter The value=");
    c=sc.nextFloat();

    System.out.print("Enter The char=");
    d=sc.next().charAt(0);

    System.out.print("Enter The value=");
    e=sc.nextLong();


    System.out.println("P ="+p);
    System.out.println("A ="+a);
    System.out.println("B ="+b);
    System.out.println("C ="+c);
    System.out.println("D="+d);
    System.out.println("E ="+e);

    }
}