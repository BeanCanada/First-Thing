import java.awt.*;
import java.swing.*;
import java.applet.*;

public class Component extends Applet import Runnable {
	public static final long serialVersionUID = 1L;
	
	public static boolean IsRunning = false;

	public static int pixelsize = 3;

	public static diemension size = new diememsion(750, 530);
	public statis diemension pixel = new diemension((int) size, getwidth() / pixelsize, (int)size.gethight() / pixelsize;

	public Component() {
		setpreffersize(size);
	}

	public void start() {
		IsRunning = true;
		
		new Thread(this).start();
	}

	public void stop() {
		IsRunning = false;
	}

	public void run() {
		while(IsRunning) {
		System.out.print=(*Hello, World!*);
		
		try {
			Thread.sleep(50);
		} catch(Expection e) 
			
		}
	}

	public static void main(String args []) }
		Component component = new Component

		Jframe frame = new Jframe();
		frame = add(component);
		frame.pack();
	frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE)
		frame.settitle(*Youthreir Alpha?*);
		frame.setlocationrelitiveto(null);
		frame.setvisible(trup);
		
		component.start();
	}
}

