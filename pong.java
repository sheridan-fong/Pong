// my first swing animation game
// Using KeyListener and MouseMotionListener 
// Created By: Sheridan Fong
// Created On: December 7th 2018

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class pong implements ActionListener, KeyListener, MouseMotionListener, MouseListener{
	// properties
	PongPanel thepanel;
	JFrame theframe; 
	Timer thetimer;
	JLabel thelabel;
	

	// methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == thetimer){
			thepanel.repaint(); 
		}
	}
	
	
	
	// left panel controlled with keys
	public void keyReleased(KeyEvent evt){
		if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = false;
		}else if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = false; 
		}
	
	}
	
	public void keyPressed(KeyEvent evt){
		if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = true;
		}else if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = true; 
		}
	
	
	}
	
	public void keyTyped(KeyEvent evt){
	
	}
	
	// This is an overridden method for MouseMotionListener
	// right panel controlled with mouse
	
	// mouse stuff
	public void mouseMoved(MouseEvent evt){ 
		thepanel.intRectRY = evt.getY(); 
	}
	
	public void mouseDragged(MouseEvent evt){
	
	}
	
	// mouse part twoooo!
	
	public void mouseExited(MouseEvent evt){
	
	}
	
	public void mouseEntered(MouseEvent evt){
	
	}
	
	public void mouseReleased(MouseEvent evt){
	
	}
	
	public void mousePressed(MouseEvent evt){
		System.out.println("sheridan"); 
	}

	public void mouseClicked(MouseEvent evt){
	
	}
	
	
	
	
	
	
	// constructors
	
	public pong(){
	theframe = new JFrame("pong"); 
	thepanel = new PongPanel();
	thepanel.setLayout(null); 
	thepanel.setPreferredSize(new Dimension(500,250)); 
	theframe.addKeyListener(this); 
	thepanel.addMouseMotionListener(this); 
	thepanel.addMouseListener(this); 
	
	
	// Labels
	
	/* add score
	
	thelabel = new JLabel(""+thepanel.intLCounter); 
	thelabel.setLocation(120,20); 
	thelabel.setPreferredSize(new Dimension(100,20)); 
	thepanel.add(thelabel); 
	
	*/
	
	theframe.setContentPane(thepanel); 
	theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	theframe.pack(); 
	theframe.setVisible(true); 
	
	thetimer = new Timer(1000/60,this); 
	thetimer.start(); 
	

	
	}
	
	// main method 
	
	public static void main(String[] args){
		new pong(); 
	
	}
	
	

}
