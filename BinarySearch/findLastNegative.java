class Demo{
	public static void main(String[]args){
		int[] arr={-43,-12,-8,0,34,56,87};
		int ans=0;
		int lastNegative=findLastNegative(arr,ans,0,arr.length);
		System.out.println(lastNegative);
	}
	static int findLastNegative(int[] arr,int ans,int low,int high){
		if(low>high)return ans;	
		int mid=low+(high-low)/2;
		if(arr[mid]<0){
			ans=arr[mid];
			low=mid+1;
		}else{
			high=mid-1;
		}
		return findLastNegative(arr,ans,low,high);		
	}
}