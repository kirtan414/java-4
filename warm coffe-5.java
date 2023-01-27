import java.util.Scanner;

class coffe{

    public static void main(String[] args) {

        az i =new az();
        az.meth b =i.new meth();
        b.factorial();
    }
}
class az
{
    class meth

    {
        void factorial()
        {
            int k=1;
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value:=");

            n=sc.nextInt();

            for (int i = 1; i <=n; i++) {
                k=k*i;  
                
            }

            System.out.println("Factorial= "+k);

        }
    }
}