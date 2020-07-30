package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet{
	PImage img;
	
	public void setup()
	{ 
		size(400,400);
		background(255);
		stroke(0);
		img=loadImage("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ3-GVG3XfknfPE6WCHEd36o25lkNpg3ih3OA&usqp=CAU","jpg");
		img.resize(0,height);
		image(img,0,0);
		
		
	}
	public void draw()
	{
		int[] color = sunColorSec(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,height/4,height/5);
		
	}
	public int[] sunColorSec(float seconds) {
		// TODO Auto-generated method stub
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		float ratio = diffFrom30/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[2]=0;
		return rgb;
	}
}
