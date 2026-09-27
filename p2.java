import java.util.*;
class Demo{
public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size of array: ");
	int n = sc.nextInt();
	int a=0;
	int b=1;
	int c;
	int what=0;
		while(n>0){
			
			System.out.println(a+b);
			c=a;
			a=a+b;
			b=c;
			n--;	
		}
		
	}
}