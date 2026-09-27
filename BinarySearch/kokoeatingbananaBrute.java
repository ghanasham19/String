class Demo{
	public static void main(String[]args){
		int[] arr={7,15,6,7};
		int k=8;
		int r_min=1;
		System.out.println(r_min);
		

		int i=0;
		int len=arr.length-1;
		int count=0;
		while(i<=len){
			int a=arr[i];
			while(a>0){
				a-=r_min;
				count++;
			}
			if(i==len){
				if(count==k){
					break;	
				}else{
					r_min++;
					i=0;
					count=0;
					continue;	
				}	
			}
			i++;
			System.out.println("hi");
		}
	
		System.out.println(r_min);
	}
}