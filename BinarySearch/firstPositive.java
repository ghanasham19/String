class Demo{
	public static void main(String[]args){
		int[] arr={-12,-11,-2,0,53,56,87};
		int ans=-1;
		int firstPositive=findFirstPositive(arr,ans,0,arr.length-1);
		System.out.println(firstPositive);
	
	}
	static int findFirstPositive(int[] arr,int ans,int low,int high){
		if(low>high)return ans;
		int mid=low+(high-low)/2;
		if(arr[mid]>0){
			ans=arr[mid];
			high=mid-1;
		}else{
			low=mid+1;
		}
		return findFirstPositive(arr,ans,low,high);
	}
}