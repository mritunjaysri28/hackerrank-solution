import java.io.*;
/*
A special method of the class that will be automatically 
call by a instanse of class is created known as constructor.
->class_name and constructor name is same.
*/
class constructor{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException{
		System.out.println("***CONSTRUCTOR***");
		Default_const con = new Default_const();
		System.out.println("ENTER VALUE TO INTIALIZED");
		DataInputStream dis = new DataInputStream(System.in);
		Parameterized_constructor pc = new Parameterized_constructor(dis.readLine());
	}
}

/*
It classified in 5 categaries:-
1> DEFAULT CONSTRUCTOR
2> PARAMETERIZED CONSTRUCTOR
3> STATIC CONSTRUCTOR
4> PRIVATE CONSTRUCTOR 
*/

/*
		DEFAULT CONSTRUTOR
It is an constructor which not pass any any value as an argument
It can`t intialize multiple constructor withh different values
*/ 
class Default_const{
	Default_const(){
	  System.out.println("DEFAULT CONSTRUCTOR INIALIZED");
	}
}

/*
		PARAMETERIZED CONSTRUCTOR
It is an constructor which pass an value as argument
It can intialize multiple constructor with multiple values due to an argument passing
*/
class Parameterized_constructor{
	Parameterized_constructor(String x){
		System.out.println("Parametized initalized => "+ x);
	}
}