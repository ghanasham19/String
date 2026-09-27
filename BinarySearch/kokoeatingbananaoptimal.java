class Demo{
	public static void main(String[]args){
		int arr[]={7,15,6,7};
		int max=15;
		int k=4;
		int r_min=1;
		int min=findmina(arr,0,max,k,r_min);
		System.out.println(min);
	
	}
	static int findmina(int[] arr,int low,int max,int k,int r_min){
		if(low>max)return r_min;
		int mid=low+(max-low)/2;
		int i=0;
		int count=0;
		while(i<arr.length){
			int a=arr[i];
			while(a>0){
				a-=mid;
				count++;	
			}
			i++;	
		}	
		if(count<=k){
			r_min=mid;
			max=mid-1;	
		}else{
			low=mid+1;	
		}
		return findmina(arr,low,max,k,r_min);
		
	}
}