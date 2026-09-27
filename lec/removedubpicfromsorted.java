class Demo{
	public static void main(String[]args){
		int arr[]={1,1,2,3,3,3,4};
		int a=1;
		int what=arr[0];
		for(int i =1;i<arr.length;i++){
			if(arr[i]!=what){
				arr[a]=arr[i];
				what=arr[i];
				a++;
			}	
		}		
		while(a<arr.length){
			arr[a]=0;
			a++;	
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);	
		}
	}
}