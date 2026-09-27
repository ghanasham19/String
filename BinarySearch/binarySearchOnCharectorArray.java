class Demo{
	public static void main(String[]args){
		char[] arr={'a','c','e','i','n','r','w'};
//                         [ 0   1   2   3   4   5   6 ]
		char target ='z';
// if we want to search upper casae charector given by user to lowwer case array then we use 
 		target=Character.toLowerCase(target);
		int where =findcharinarray(arr,target,0,arr.length-1);
		System.out.println(where);
	}
	static int findcharinarray(char[] arr,char target,int low,int high){
		if(low>high)return -1;
		int mid = low+(high-low)/2;
		if(arr[mid]==target)return mid;
		if(arr[mid]<target)low=mid+1;
		else{
		high=mid-1;
		}
		return findcharinarray(arr,target,low,high);

	}
}