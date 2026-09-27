class Demo{
	public static void main(String[]args){
		int[] arr={1,3,5,7,9};
//                         0 1 2 3 4
		int ans=0;
		int target=2;
		int insertionPosition=findInsertionPosition(arr,ans,target,0,arr.length-1);
		System.out.println(insertionPosition);
	}
	static int findInsertionPosition(int[] arr,int ans,int target,int low,int high){
			     if(low>high)return ans;
			     int mid=low+(high-low)/2;   
			     if(arr[mid]>target){
				ans=mid;
				high=mid-1;
			     }else{	
				low=mid+1;
			     }
			     return findInsertionPosition(arr,ans,target,low,high);       
	}
}