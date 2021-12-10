import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
	// Green background
    background(210, 255, 173);
    
    // Blue background
    noStroke();
    fill(153, 204, 255);
    rect(0, 0, 600, 300);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	 
	 // Cloud #1
	 noStroke();
	 fill(255, 255, 255);
	 ellipse(100, 75, 40, 40);
	 ellipse(115, 90, 40, 40);
	 ellipse(85, 90, 40, 40);
	 ellipse(120, 75, 40, 40);
	 ellipse(135, 90, 40, 40);
	 
	 // Cloud 2
	 noStroke();
	 fill(255, 255, 255);
	 ellipse(450, 115, 40, 40);
	 ellipse(465, 130, 40, 40);
	 ellipse(435, 130, 40, 40);
	 ellipse(470, 115, 40, 40);
	 ellipse(485, 130, 40, 40);
	 
	 // House Structure (Rectangle and Triangle)
	 noStroke();
	 fill(102, 0, 0);
	 rect(150, 250, 250, 200);
	 
	 noStroke();
	 fill(153, 0, 0);
	 triangle(150, 250, 400, 250, 275, 100);
	 
	 // Door
	 stroke(0, 0, 0);
	 fill(153, 76, 0);
	 rect(275, 349, 65, 100);
	 
	 // Doorknob
	 fill(204, 204, 0);
	 ellipse(330, 400, 10, 10);
	 
	 // Sun
	 fill(255, 255, 51);
	 ellipse(600, 0, 100, 100);
	 
  }
  
  // define other methods down here.
}