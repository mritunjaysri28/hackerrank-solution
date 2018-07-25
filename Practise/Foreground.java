import java.awt.*;
import java.applet.*;

/*<applet code="Foreground" width="300" height="100"></applet>*/

public class Foreground extends Applet{
	
	public void init(){
		setForeground(Color.red);
	}
	/*
	public void start(){
		//start or resume execution
	}
	
	public void stop(){
		//suspend execution
	}
	
	public void destroy(){
		//app shutdown
	}*/
	
	public void paint(Graphics g){
		g.drawString("sd",30,30);//display content on window
	}
}