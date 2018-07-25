import java.io.*;

/*
DataInputStream is read an primitive data type
readLine => its read the line of text.
readBoolean => input BOOLEAN
readChar => input Char
readData_type => input DATA_TYPE
*/
class Datainputstream{
	//@SuppressWarnings("deprecation")
	public static void main(String args[]) throws IOException{
		DataInputStream di = new DataInputStream(System.in);
		String i = di.readLine();
		System.out.println(i);
	}
}