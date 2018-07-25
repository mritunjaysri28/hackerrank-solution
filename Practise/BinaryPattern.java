class Binary_number{
	public static void main(String[] arg){
		int count=1;
		for(int i=1;i<5;i++){
			for(int j=1;j<=i;j++)
				System.out.print(count++%2);
			System.out.println("");
			if(i%2==0)
				count=1;
			else
				count=0;
		}
	}
}