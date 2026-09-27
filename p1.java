import java.util.*;
class Demo{
public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size of array: ");
	int n = sc.nextInt();
	int []arr = new int[n];
	// int int []arr , here [] define that the variable arr is array of data having type int	
		System.out.println(arr);
		System.out.println("Enter the NUmbers for array");
			
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");	
		}
	}
}