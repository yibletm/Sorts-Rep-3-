import java.util.Scanner;
public class BubbleS{

public static void main(String args[])
{
    
Scanner input = new Scanner(System.in);
int[] arr = new int[5];
arr[0] = input.nextInt();  //3
arr[1] = input.nextInt();  //4
arr[2] = input.nextInt();  //1
arr[3] = input.nextInt();  //5
arr[4] = input.nextInt();  //2
int curr = 0;
//Incoming best case O(N), other case O(N^2)
for(int i=0; i<5; i++)
{
    for(int j=0; j<5; j++)
    {
        if(curr < arr[j])
        {
            curr = arr[j];
            System.out.println("Curr change");
        }
        else
        {
            System.out.println("Shift");
            arr[j-1] = arr[j];
            arr[j] = curr;
        }


    }
    curr = 0;
}



}








}