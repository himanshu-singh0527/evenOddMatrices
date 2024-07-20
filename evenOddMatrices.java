import java.util.*;
public class evenOddMatrices{
    public static void main(String args[]){
        ArrayList<Integer>array=new ArrayList<>();
        ArrayList<Integer>evenArray=new ArrayList<>();
        ArrayList<Integer>oddArray=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            array.add(number);
            // to get even array
            if(i%2==0){
                evenArray.add(array.get(i));
            }
            else{
                oddArray.add(array.get(i));
            }
        }
        Collections.sort(evenArray);
        System.out.println("Sorted Even array:"+evenArray);
        Collections.sort(oddArray);
        System.out.println("Sorted odd array is:"+ oddArray);
        
        if(evenArray.size() > 1 && oddArray.size() > 1){
            System.out.println(evenArray.get(1) + oddArray.get(1));
        }else{
            System.out.println("Not enough elements to perform the sum.");
        }
    }
}