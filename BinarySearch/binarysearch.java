class Demo{	
	public static void main(String[]args){	
		int[] arr={11,25,32,46,54,68,76,88,97};
//			  [ 0  1  2  3  4  5  6  7  8 ]	
		int target=24;
		int indext=findElement(arr,target,0,arr.length-1);
		System.out.println(indext);
	}
	static int findElement(int[] arr,int target,int low,int high){
			if(low>high)return -1;
			int mid=low+(high-low)/2;
			if(arr[mid]==target) return mid;
			if(arr[mid]>target)high=mid-1;
			else{
			low=mid+1;
			}
			return findElement(arr,target,low,high);
		
	}
}