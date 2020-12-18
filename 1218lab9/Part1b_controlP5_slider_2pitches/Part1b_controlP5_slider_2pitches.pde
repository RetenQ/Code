import controlP5.*;
import ddf.minim.*;
import ddf.minim.ugens.*;

Minim minim;
AudioOutput out;
Oscil wave1,wave2;


ControlP5 cp5;
int myColorBackground = color(0,0,0);
int myColor = color(100);
float fund,detune;
Frequency currF1, currF2;
Summer sum;

void setup() {
size(220,300);
cp5 = new ControlP5(this);

minim = new Minim(this);
  // use the getLineOut method of the Minim object to get an AudioOutput object
  out = minim.getLineOut();
  sum = new Summer();
  currF1=Frequency.ofPitch("A4");
  currF2=Frequency.ofPitch("A4");
  
  wave1 = new Oscil( currF1, 0.5f, Waves.SINE);
  wave2 = new Oscil( currF2, 0.5f, Waves.SINE);

  sum.patch(out);

cp5.addSlider("Osc1")
     .setPosition(50,50)
     .setSize(10,100)
     .setRange(0,10)
     .setValue(0)
     .setNumberOfTickMarks(5) 
     ;
     
cp5.addToggle("Osc1tog")
     .setPosition(50,200)
     .setSize(50,20)
     .setValue(true)
     .setMode(ControlP5.SWITCH)
     ; 

cp5.addSlider("Osc2")
     .setPosition(150,50)
     .setSize(10,100)
     .setRange(0,10)
     .setValue(0)
     .setNumberOfTickMarks(5) 
     ;

  cp5.addToggle("Osc2tog")
     .setPosition(150,200)
     .setSize(50,20)
     .setValue(true)
     .setMode(ControlP5.SWITCH)
     ;
      
}

void draw() {
  fill(myColorBackground);
  rect(0,0,width,180);
  fill(myColor);
  rect(0,180,width,120);
}

void Osc1(float v) {
  if(v==0.0f){
    currF1 = Frequency.ofPitch( "A4" );
    wave1.setFrequency(currF1);
  }
  else if(v==2.5f){
    currF1 = Frequency.ofPitch( "C#5" );
    wave1.setFrequency(currF1);
  }
  else if(v==5.0f){
    currF1 = Frequency.ofPitch( "E5" );
    wave1.setFrequency(currF1);
  } else if(v==7.5f){
    currF1 = Frequency.ofPitch( "G5" );
    wave1.setFrequency(currF1);
  } else if(v==10.0){
    currF1 = Frequency.ofPitch( "B5" );
    wave1.setFrequency(currF1);
  } 
}

void Osc1tog(boolean flag) {
  if(flag==true) {
    wave1.unpatch(sum);  //turn off wave1
  } else {
    wave1.patch(sum);  //turn on wave1
  }
}
void Osc2(float v) {
  if(v==0.0f){
    currF1 = Frequency.ofPitch( "A4" );
    wave1.setFrequency(currF1);
  }
  else if(v==2.5f){
    currF1 = Frequency.ofPitch( "C#5" );
    wave1.setFrequency(currF1);
  }
  else if(v==5.0f){
    currF1 = Frequency.ofPitch( "E5" );
    wave1.setFrequency(currF1);
  } else if(v==7.5f){
    currF1 = Frequency.ofPitch( "G5" );
    wave1.setFrequency(currF1);
  } else if(v==10.0){
    currF1 = Frequency.ofPitch( "B5" );
    wave1.setFrequency(currF1);
  } 
}


void Osc2tog(boolean flag2) {
    if(flag2==true) {
    wave1.unpatch(sum);  //turn off wave1
  } else {
    wave1.patch(sum);  //turn on wave1
  }// turn on and off wave2 
}
