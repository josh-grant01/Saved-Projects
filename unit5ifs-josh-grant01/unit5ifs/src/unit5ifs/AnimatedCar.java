package unit5ifs;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Grant
//Date - 2-24-18
//Class - Programming 6
//Lab  - Animated Car

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Canvas;

class AnimatedCar extends Canvas
{
	private int x;
	private int y;
	private Timer timer;
	private final static int SLEEP = 150;  //bigger # = slower animation	
	
	public AnimatedCar(int width, int heigth)
	{
		setSize(width, heigth);
		setVisible(true);
		setBackground(Color.BLACK);

		x = 0;
		y = 50;

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  //each time timer fires it will call paint
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}	
	
	public void update(Graphics window)
	{
	   paint(window);	
	}
	
	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.fillRect(0,0,getWidth(),getHeight());
		
		window.setColor(Color.WHITE);
		window.drawString("Animation Lab - Lab05ifs", 25, 50 );

		window.setColor(Color.GREEN);
		window.fillRect(x + 25, y + 175, 100, 50);

		
		//draw a wheel
		window.setColor(Color.red);
                window.fillOval(x + 5, y + 200, 50, 50);

                
		//draw another wheel
		window.fillOval(x + 105, y + 200, 50, 50);
		
		//increment x by 50
                x += 50;
		
		//if x has reached the far right side of the screen
		//set it back to zero
                if( x >= 700 )
                {
                    x = 0;
                }
	}	
}