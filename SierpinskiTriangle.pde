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