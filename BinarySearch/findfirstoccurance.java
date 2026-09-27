class Demo{
	public static void main(String[]args){
		int[] arr={1,2,3,3,4,4,4,4,6,6,7};
//                         0 1 2 3 4 5 6 7 8 9 10
		int ans=-1;
		int target=6;
		int firstOccurance=findFirstElement(arr,target,ans,0,arr.length-1);
		System.out.println(firstOccurance);
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

}