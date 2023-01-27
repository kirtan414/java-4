import java.util.Scanner;

class coofi

   {

    public static void main(String[] args) {

        int p;
        int q;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the p=");
        p=sc.nextInt();

        System.out.print("Enter The q=");
        q=sc.nextInt();

        if(p>q)

        {
            System.out.println("p is Big");
        }

        else

        {
            System.out.print("q is Big");

        }
    }
}