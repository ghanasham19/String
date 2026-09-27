class Demo{
	public static void main(String[]args){
		int[] arr={1,2,3,3,3,3,7,7,8,11};
		int ans=-1;
		int target=1;
		int firstOccurance=findFirstElement(arr,target,ans,0,arr.length-1);
		int lastOccurance=findLastElement(arr,target,ans,0,arr.length-1);
		int count=lastOccurance-firstOccurance+1;
		if(firstOccurance==-1){
		System.out.println("not found");
		}else{
		System.out.println(count);	
		}
	}
	static int findFirstElement(int[] arr,int target,int ans,int low,int high){
		if(low>high)return ans;
		int mid=low+(high-low)/2;
		if(arr[mid]==target)ans=mid;
		if(arr[mid]>=target){
			high=mid-1;
		}else{
			low=mid+1;
		}
		return findFirstElement(arr,target,ans,low,high);
	}
	static int findLastElement(int[] arr,int target,int ans,int low,int high){
		if(low>high)return ans;
		int mid=low+(high-low)/2;
		if(arr[mid]==target)ans=mid;
		if(arr[mid]<=target){
			low=mid+1;
		}else{
			high=mid-1;
		}
		return findLastElement(arr,target,ans,low,high);
	}
}