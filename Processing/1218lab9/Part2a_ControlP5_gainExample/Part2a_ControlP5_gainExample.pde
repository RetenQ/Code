//832003314 兰弘羿        MU 20122756LanHongyi

import ddf.minim.*;
import ddf.minim.ugens.*;

// declare everything we need to play our file
import controlP5.*;
Minim minim;

FilePlayer filePlayer;
FilePlayer filePlayer2;

Gain       gain;
Gain       gain2;

AudioOutput out;
AudioOutput out2;

ControlP5 cp5;

int n =-12;
int m = +12;
int v = 0;

String fileName = "groove.mp3";
String fileName2 = "truax_basilica.wav";

void setup()
{
  // setup the size of the app
  size(740, 600);
  
  // create our Minim object for loading audio
  minim = new Minim(this);
  cp5 = new ControlP5(this); 
    cp5.addKnob("Gain1")
  .setPosition(680,75)
  .setMin(n)
  .setMax(m)
  .setValue(v)
  .setWidth(40);
 //SET GRAIN2 
   cp5.addKnob("Gain2")
  .setPosition(680,275)
  .setMin(n)
  .setMax(m)
  .setValue(v)
  .setWidth(40);
  
                        
 //Set the music player to control what we wlii play
  filePlayer = new FilePlayer( minim.loadFileStream(fileName) );
  filePlayer.loop();
  filePlayer2 = new FilePlayer( minim.loadFileStream(fileName2) );
  filePlayer2.loop();


  gain = new Gain(0.f);
  gain2 = new Gain(0.f);
  
  out = minim.getLineOut();
  out2 = minim.getLineOut();
  
  filePlayer.patch(gain).patch(out);
  filePlayer2.patch(gain2).patch(out2);                        
}

void draw()
{
  background( 0 );
  
  stroke( 255 );
  // Draw the First waveforms
  for( int i = 0; i < out.bufferSize() - 1; i++ )
  {
    // find the x position of each buffer value
    float x1  =  map( i, 0, out.bufferSize(), 0, 640 );
    float x2  =  map( i+1, 0, out.bufferSize(), 0, 640 );
    // draw a line from one buffer position to the next for both channels
    line( x1, 50 + out.left.get(i)*50, x2, 50 + out.left.get(i+1)*50);
    line( x1, 150 + out.right.get(i)*50, x2, 150 + out.right.get(i+1)*50);
  }  
  
  //// Draw the Second waveforms
    for( int i = 0; i < out2.bufferSize() - 1; i++ )
  {
    // find the x position of each buffer value
    float x3  =  map( i, 0, out2.bufferSize(), 0, 640 );
    float x4  =  map( i+1, 0, out2.bufferSize(), 0, 640 );
    // draw a line from one buffer position to the next for both channels
    line( x3, 250 + out2.left.get(i)*50, x4, 250 + out2.left.get(i+1)*50);
    line( x3, 350 + out2.right.get(i)*50, x4, 350 + out2.right.get(i+1)*50);
  }  
  
  
  
  //Set the function to control the Gain1 and Gain2 by chaging their value
}
void Gain1(float g){
gain.setValue(g);
}
//SET2
void Gain2(float f){
gain.setValue(f);
}
