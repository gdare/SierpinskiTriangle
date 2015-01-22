import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

public boolean toBig = true;
public int tri = 200;
public void setup(){
	size(500,500);
}
public void draw(){
	background(0);
	sierpinski(mouseX,mouseY,tri);
}
public void mouseClicked()//optional
{
	if(toBig == true){
		tri += 25;
		if(tri > 500){
			toBig = false;
		}
	}
    if (toBig == false){
    	tri -= 25;
    	if(tri < 25){
    		toBig = true;
    	}
    }
}
public void sierpinski(int x, int y, int len) {
	if (len < 25){
		triangle(x, y, x +len, y, x + len/2, y + len);

	}
	else { 
		sierpinski(x, y, len/2);
		sierpinski(x + len/2, y, len /2);
		sierpinski(x + len/4, y + len/2,len/2);
	    
    }   
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
