import java.awt.*;
import java.applet.*;

/*<applet code="Switching_graphics" width="3000" height="50"></applet>*/

public class Switching_graphics extends Applet{
	
	String flow;
	
	public void init(){
		setBackground(Color.red);
		setForeground(Color.yellow);
		flow += "---Called init()";
	}
	
	public void start(){
		flow += "---Called start()";
	}
	
	public void stop(){
		flow += "---Called stop()";
	}
	
	public void destroy(){
		flow += "---Called destroy()";
	}
	
	public void paint(Graphics g){
		flow += "---Called paint()";
		g.drawString(flow,150,25);
	}
	
}