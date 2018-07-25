import java.io.*;                                                                                                                            
class Power{
	public static void main(String[] args) throws IOException{
		int ans=0, a, b,i,j;
		DataInputStream scan = new DataInputStream(System.in);
		a = scan.readInt();
		b = scan.readInt();/*
		for(i=0 ; i<b-1 ; i++){
			for(j=0 ; j<a ; j++){
				ans = ans + j;
			}
		}*/
		System.out.println("Power of " + a + " & " + b + " is " + ans);
	}
}