import beads.*;
import java.util.Arrays;
import controlP5.*;

AudioContext ac;
Gain g;
ControlP5 cp5;
float slow;
Envelope speedControl;
SamplePlayer player, player2;
String audioFileName;
ScrollableList sc;
color myC;
String [] songArray;



void setup() {
  size(300,300);
  ac = new AudioContext();
  cp5 = new ControlP5(this);
  
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
  
  
  //The folowing code will load the first song from our array
  songArray = new String[] {"groove.mp3","classicalguitar.wav","truax_basilica.wav"};
  audioFileName = sketchPath("") + "Data/"+songArray[0];
  println(""+songArray[0]);
  player = new SamplePlayer(ac, SampleManager.sample(audioFileName));
  
  //create a gain/volume object to control the gain
  g = new Gain(ac, 1, 0.2);  //set the starting volume to 0.2
  
  //next we creat a speedControl object to control the speed rate of the song
  slow=0.5;    // the speed rate to the song speed (0.5 for half speed)
  //we can use and envelope to set how the speed changes over time
  //here we just set the speed of 0.5 to start immediately
  
  slow=0.5;
  speedControl = new Envelope(ac, 1);
  speedControl.setValue(slow);
  player.setRate(speedControl);
  
  g = new Gain(ac, 1, 0.2);
  g.addInput(player);
  ac.out.addInput(g);
  ac.start();
  
    /* add a ScrollableList - by default it behaves like a DropdownList */
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
//load all pixels to the pixels array
  //set the background
  
void draw() {
 background(0);
 loadPixels();  
  Arrays.fill(pixels, back);  //set all pixels to black  
                              //static method to fill Array
  //scan across the pixels
  for(int i = 0; i < width; i++) {
    //for each pixel work out where in the current audio buffer we are
    int buffIndex = i * ac.getBufferSize() / width;
    //then work out the pixel height of the audio data at that point
    int vOffset = (int)((1 + ac.out.getValue(0, buffIndex)) * height / 2);
    //draw into Processing's convenient 1-D array of pixels
    vOffset = min(vOffset, height);
    
    //pixels is the array of all pixels in the display window
    //set the pixel at the waveform peak (height) to fore color
    pixels[vOffset * height + i] = fore;
  }
  updatePixels();

}

//restart the song if we press the 'l' key
void keyPressed() {
  if (key=='l') {player.setToLoopStart();player.start();}
}

//set the volume using the mouse
void Gain1(float g1){
  g1= map(g1,-12,12,0,1);
g.setGain(g1);
}
void Gain2(float g1){
    
  slow=g1;
  
  speedControl.setValue(slow);
  player.setRate(speedControl);
}


 
 







void dropdown(int n) {
player.setToEnd(); //stop the current file playing
audioFileName = sketchPath("") + "Data/"+songArray[n];
//load the new audio file
player = new SamplePlayer(ac, SampleManager.sample(audioFileName));
//set the speed for the new song
player.setRate(speedControl);
//set a new gain object and add the player as input
g = new Gain(ac, 2, 0.2);
g.addInput(player);
//send the audio to the output
ac.out.addInput(g);
}
