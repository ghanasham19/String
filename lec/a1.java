class Demo{
	public static void main(String[]args){
		int arr[]={3,2,1,5,8,1};
		boolean what=fun(arr,0);	
		System.out.println(what);
	}
	static boolean fun(int arr[],int index){
		if(arr.length==index)return true;
		for(int i=index+1;i<arr.length;i++){
			if(arr[i]==arr[index])return false;
		}
		return fun(arr,index+1);
	}	
}
	 