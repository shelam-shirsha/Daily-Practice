import java.util.Scanner;
class PatternPrint{
static void  printPattern(int n){
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print("* ");
        }
         System.out.println();
    }
}
}

class Pattern{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        PatternPrint.printPattern(n);
    }
}