import controlP5.*;
import ddf.minim.*;
import ddf.minim.ugens.*;

Minim minim;
AudioOutput out;
Oscil       wave, mod;
ControlP5 cp5;

Slider os1;
Slider os2;

void setup() {

  size(300,300);
  noStroke();
  cp5 = new ControlP5(this);
  minim = new Minim(this);
  out = minim.getLineOut();
  wave = new Oscil( 440, 0.8f, Waves.TRIANGLE);
  mod = new Oscil( 2, 0.8f, Waves.SINE);
  
  // add a horizontal slider, the value of this slider will be linked
  // to variable 'Osc1' in the function below draw() 
  os1=cp5.addSlider("Osc1")
     .setPosition(50,30)
     .setRange(100,1000)
     .setSize(120,20)
     .setValue(10)
     .setNumberOfTickMarks(10)  //must be > 1
     ;
  os1.getValueLabel().align(ControlP5.LEFT,ControlP5.TOP_OUTSIDE).setPaddingX(0);
  os1.getCaptionLabel().align(ControlP5.RIGHT,ControlP5.TOP_OUTSIDE).setPaddingX(0);
  
   cp5.addToggle("Osc1toggle")
     .setPosition(220,30)
     .setSize(50,20)
     .setValue(true)
     .setMode(ControlP5.SWITCH)
     ;
    
 //os2 LFO   
     os2=cp5.addSlider("LFO")
    .setPosition(50,130)
    .setRange(0,10)
    .setSize(120,20)
    .setValue(1)
    ;
os2.getValueLabel().align(ControlP5.LEFT, ControlP5.TOP_OUTSIDE).setPaddingX(0);
os2.getCaptionLabel().align(ControlP5.RIGHT, ControlP5.TOP_OUTSIDE).setPaddingX(0);
     
    cp5.addToggle("LFOtoggle")
    .setPosition(220,130)
    .setSize(50,20)
    .setValue(true)
    .setMode(ControlP5.SWITCH)
    ;


}

void draw() {
   fill(100);
   rect(0,0,width,100);
   rect(0,0,width,200);
}

void Osc1(float freq) {
  wave.setFrequency(freq);
}

void Osc2(float freq) {
  wave.setFrequency(freq);
}


void Osc1toggle(boolean theFlag) {
  if(theFlag==true) {
   wave.unpatch(out);
  } else {
   wave.patch(out);
  }
}

void Osc1toggle2(boolean theFlag) {
  if(theFlag==true) {
   wave.unpatch(out);
  } else {
   wave.patch(out);
  }
}

    void LFO(float freq) {
    mod.setFrequency(freq);
    }
    
    void LFOtoggle(boolean flag) {
    if(flag==true) {
    mod.patch(wave.amplitude); //connect the modulator to the wave i.e.,
    } else { //turn on Amplitude Modulation
    mod.unpatch(wave); //disconnect the modulator from the wave i.e.,
    } //turn off amplitude modulation
    }
