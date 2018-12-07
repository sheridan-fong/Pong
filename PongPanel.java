import javax.swing.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.io.*; 
import javax.imageio.*; 

public class PongPanel extends JPanel{

	// properties; 
	// int intRectX = 40;
	int intRectY = 50; 
	int intRectRY = 50; 
	boolean blnGoDown = false; 
	boolean blnGoUp = false; 
	int intCX = 248;
	int intCY = 125;
	int intLCounter = 0; 
	int intRCounter = 0; 
	JLabel thelabel; 
	
	// boolean statements for ball 
	boolean blnCUp = true;
	boolean blnCDown = false; 
	boolean blnCLeft = false; 
	boolean blnCRight = true; 

	public void paintComponent(Graphics g){
	// repaints background
	
		g.setColor(Color.BLACK); 
		g.fillRect(0,0,500,250);
		
		// repaints left side of panel 
		g.setColor(Color.YELLOW); 
		g.fillRect(250,0,5,500); 
		
		g.fillRect(40, intRectY, 10,30); 
		
		
		
		// adjusts location of left rectangle 
		if(blnGoDown){
			intRectY += 3; 
		}
		
		if(blnGoUp){
			intRectY -= 3; 
		}
		
		// right hand rectangle 
		g.fillRect(460, intRectRY, 10, 30); 
		
		//circle 
		// oval (x, y, width, height)
		g.setColor(Color.RED); 
		g.fillOval(intCX,intCY, 10, 10); 
		
		
	
		
		// set perimaters (x-axis)
		if(intCX == 0){
			intCX = 248; 
		}else if(intCX == 500){
			intCX = 248;
		}
		
		// set y perimeters
		if(intCY <= 0){
			blnCUp = false; 
			blnCDown = true; 
			System.out.println("got here"); 
		}else if(intCY >= 250){
			blnCDown = false; 
			blnCUp = true; 
		// System.out.println("got here"); 
		}
		
		// set up right paddle board
		
		if(intCX >450 && intCX > intCX - 10){
		
			if(intCY >= intRectRY-15 && intCY <= intRectRY+15){ 
				blnCRight = false; 
				blnCLeft = true; 
			}
		}
		
		// set up left paddle board
		if(intCX < 50 && intCX > intCX -10){
			if(intCY >= intRectY-15 && intCY <= intRectY+15){
				blnCLeft = false; 
				blnCRight = true; 
			}
		}
		
		
		// set up if statements for boolean to make the ball shift and it's direction
		if(blnCUp){
			intCY-= 2;
		}
		
		if(blnCDown){
			intCY += 2;
		}
		
		if(blnCLeft){
			intCX-= 2;
		}
		
		if(blnCRight){
			intCX+= 2;
		}
		
		
		
		if(intCX <40){
			intRCounter = intRCounter + 1; 
			System.out.println(intRCounter); 
		}else if(intCX > 460){
			intLCounter = intLCounter +1;
			System.out.println(intLCounter); 
		}
		
		
		
		
	}


// constructor 
public PongPanel(){
	super();
}



}
