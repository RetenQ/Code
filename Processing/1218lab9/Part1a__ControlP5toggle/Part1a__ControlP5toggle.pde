//832003314 兰弘羿        MU 20122756LanHongyi


//Declare everything we need
import controlP5.*;
import ddf.minim.*;
import ddf.minim.ugens.*;
Minim minim;
AudioOutput out;
Oscil wave, mod;
ControlP5 cp5;
int col = color(255);
boolean toggleValue = false;

void setup() {
  size(400,400);
  smooth();
  cp5 = new ControlP5(this);
  minim = new Minim(this);
  out = minim.getLineOut();
  wave = new Oscil( 440.f, 0.5f, Waves.TRIANGLE);
  
  // Create  toggles
  cp5.addToggle("toggleValue")
     .setPosition(40,100)
     .setSize(50,20)
     ;

  cp5.addToggle("toggle")
     .setPosition(40,250)
     .setSize(50,20)
     .setValue(true)
     .setMode(ControlP5.SWITCH)
     ;  
}
  

void draw() {
  background(0);
  pushMatrix();
  
  //finishi the playground and things
  if(toggleValue==true) {
    fill(255,255,220);
  } else {
    fill(128,128,110);
  }
  translate(280,100);
  ellipse(0,0,100,100);
  
  
  translate(0,150);
  fill(col);
  ellipse(0,0,40,40);
  
  popMatrix();
}


void toggle(boolean theFlag) {
if(theFlag==true) {
col = color(255);
wave.unpatch(out); 
} else {
col = color(100);
wave.patch(out); 
}

//change the color by judging the boolean
  if(theFlag==true) {
    col = color(255);
  } else {
    col = color(100);
  }
}
