//832003314 兰弘羿        MU 20122756LanHongyi

import beads.*;
import java.util.Arrays;
import controlP5.*;

//Declare evetything

AudioContext ac;
Gain g;
ControlP5 cp5;
Envelope speedControl;
SamplePlayer player, player2;
ScrollableList sc;

float slow;
String audioFileName;
color myC;
String [] songArray;



void setup() {
  size(300,300);
  ac = new AudioContext();
  cp5 = new ControlP5(this);
  
  //Set tow togges to control
  
   cp5.addKnob("Gain1")
  .setPosition(250,50)
  .setMin(-12)
  .setMax(12)
  .setValue(0)
  .setWidth(40);
  
   cp5.addKnob("Gain2")
  .setPosition(250,175)
  .setMin(0.5)
  .setMax(4)
  .setValue(0)
  .setWidth(40);
  
  //Set somethings to load the music
  songArray = new String[] {"groove.mp3","classicalguitar.wav","truax_basilica.wav"};
  audioFileName = sketchPath("") + "Data/"+songArray[0];
  println(""+songArray[0]);
  player = new SamplePlayer(ac, SampleManager.sample(audioFileName));
  
  //create a gain/volume object to control the gain
  g = new Gain(ac, 1, 0.2);  //set the starting volume to 0.2
  
  //Creat a speedControl object to control the speed rate of the song 
  slow=0.5;
  speedControl = new Envelope(ac, 1);
  speedControl.setValue(slow);
  player.setRate(speedControl);
  
  //Create to control the value of the music
  g = new Gain(ac, 1, 0.2);
  g.addInput(player);
  ac.out.addInput(g);
  ac.start();
  
  /* Add a ScrollableList - by default it behaves like a DropdownList */
  sc=cp5.addScrollableList("dropdown")
     .setPosition(50, 50)
     .setSize(200, 100)
     .setBarHeight(20)
     .setItemHeight(20)
     .addItems(songArray)
     .setColorActive(color(0,255,0))
      ;
     
  myC= color(255,255,0);
  sc.getCaptionLabel().toUpperCase(true);
  sc.getCaptionLabel().set("Song Listbox");
  sc.getCaptionLabel().setColor(myC);
}

color fore = color(255, 102, 204);
color back = color(0,0,0);

  
void draw() {
 background(0);
 loadPixels();  
  Arrays.fill(pixels, back);  
 
  for(int i = 0; i < width; i++) {
    int buffIndex = i * ac.getBufferSize() / width;
    int vOffset = (int)((1 + ac.out.getValue(0, buffIndex)) * height / 2);
    vOffset = min(vOffset, height);
    pixels[vOffset * height + i] = fore;
  }
  updatePixels();

}

//Restart the song if we press the 'l' key
void keyPressed() {
  if (key=='l') {player.setToLoopStart();player.start();}
}

//Set Gain1 to control the value of music
void Gain1(float g1){
  g1= map(g1,-12,12,0,1);
g.setGain(g1);
}

//Set Gain2 to control the slow
void Gain2(float g1){
    
  slow=g1;
  speedControl.setValue(slow);
  player.setRate(speedControl);
}





//Change Songs 
void dropdown(int n) {
player.setToEnd(); 
audioFileName = sketchPath("") + "Data/"+songArray[n];
player = new SamplePlayer(ac, SampleManager.sample(audioFileName));
player.setRate(speedControl);
g = new Gain(ac, 2, 0.2);
g.addInput(player);
ac.out.addInput(g);
}
