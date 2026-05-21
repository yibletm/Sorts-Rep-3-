public class BubbleS{

public static void main(String args[])
{

int[] arr = new int[5];
arr[0] = 3;
arr[1] = 4;
arr[2] = 1;
arr[3] = 5;
arr[4] = 2;
int curr = 0;
//Incoming best case O(N), other case O(N^2)
for(int i=0; i<5; i++)
{
    for(int j=0; j<5; j++)
    {
        if(curr < arr[j])
        {
            curr = arr[j];
            System.err.println("Curr change");
        }
        else
        {
            System.err.println("Shift");
            arr[j-1] = arr[j];
            arr[j] = curr;
        }


    }
    curr = 0;
}



}








}