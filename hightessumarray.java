class demo{
	public static void main(String[]args){
		int arr[]={1,2,-4,3,6,8,-14,-3,-2};
		int sum=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			
			sum+=arr[i];
			if(sum>max)max=sum;
			if(sum<0)sum=0;
			
		}	
		System.out.println(max);
	}
}