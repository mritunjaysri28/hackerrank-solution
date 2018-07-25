class Christmas_tree{
	
	public static void main(String[] arg){
		System.out.println("\n   CHRISTMAS TREE");
		delay(999999);
		tree(0,6,8,0);
		delay(999999);
		tree(1,7,8,1);
		delay(999999);
		tree(3,8,8,2);
		delay(999999);
		pot();
	}
	
	public static void tree(int i,int n,int s,int t){
		String line = "";
		for(;i<n;i++){
			for(int k=s;k>i;k--){
				line+=" ";
			}
			for(int j=0;j<2*i+1;j++){
				line+="*";
			}
			System.out.println(line);
			line="";
		}
	}
	
	public static void pot(){
		String line="";
		//branch
		for(int j=0;j<2;j++){
			System.out.println("        *");
		}
		//base
		System.out.println("    *********");		
        //middle part of pot
		for(int j=0;j<5;j++){
			line+=" ";
		}
		line+="*";
		for(int j=0;j<5;j++){
			line+=" ";
		}        
		line+="*";
		System.out.println(line);
		//end part of pot
		System.out.println("      *****");
	}
	
	public static void delay(long d){
		for(long i=0;i<100*d;i++);
	}
}