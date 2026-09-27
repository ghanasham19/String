class Demo{
	public static void main(String[]args){
		String s ="A ZOp, a plan, a canal:papOZa";
		
		int i=0;
		int j=s.length()-1;
		boolean what=true;
		while(i<j){
			if(!Character.isLetter(s.charAt(i))){
				i++;
				continue;
			}
			else if(!Character.isLetter(s.charAt(j))){
				j--;
				continue;
			}
			char a=Character.toLowerCase(s.charAt(i));
			char b=Character.toLowerCase(s.charAt(j));
			if(a!=b){
				what=false;
				break;
			}
			i++;	
			j--;
			
		}
		System.out.println(what);
	}
}