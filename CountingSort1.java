import java.util.Scanner;


public class CountingSort1 {

   
       public static void main(String[] args) {
              // TODO Auto-generated method stub
              Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberCount[] = new int[100];
        //track the number count
        for(int i=0;i<n;i++)
        {
            int number = sc.nextInt();
            numberCount[number]+=2;
        }
        //print number count
        for(int i=0;i<numberCount.length;i++)
        {
            System.out.print(numberCount[i]+" ");
        }
       }

}