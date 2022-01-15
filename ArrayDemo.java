import java.util.Scanner;

public class ArrayDemo
{
    public static void main(String[] args)
    {   int count=0;
        int arr[]= new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i <10 ; i++)
        {
            for (int j = i+1; j < 10; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(i+"and"+j+"indexes");
                }

            }

        }


    }

}
