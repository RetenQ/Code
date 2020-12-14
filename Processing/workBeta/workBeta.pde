/*
  1.different coloured primitives
  2.Move
  */
  
  
  // I want to make a n animation like Pac-Man.
  void setup()
  {
  size(550,550);
  background(0,0,0);
  
  /*I create a window and it`s background is black
    The reason why I set "background" here is that the color of background can be changed in “void draw”. 
    Then I will create  some rectangles and their color are random,their locations are random as well.
    Please read the code from the 52th row,thx! */
    
  fill(random(255),random(255),random(255));  
  rect(random(500),random(500),20,20); 
  //create a rectangle,and its color and location are random.
    fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);
  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);
    fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);  fill(random(255),random(255),random(255));
  rect(random(500),random(500),20,20);
  }
 
 void draw()
 {
   
   textSize(64);
   fill(255,255,0);
   text("Pac-Man",130,100);
   
   textSize(30);
   fill(255,255,0);
   text("Simplified Version",250,130);
   
   
   textSize(20);
   fill(255,255,0);
   text("Designed by Lan,Hongyi  FZU & MU",200,500);
   
   // I create some texts firstly.
   
   float a=random(255);
   float b=random(255);
  
  //Then I set some variables so that next step will be more convenient.
  
  /*I use the "arc" to create the Pac-Man,and they will eat the rectangles.
    At the same time.they will keep the texts.
    please read from 127th raw.   
    */ 
  
   strokeWeight(5);
   fill(a,b,0);
 arc(20,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(60,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(100,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(140,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(180,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(220,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(260,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(300,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(340,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(380,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(420,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(460,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(500,frameCount,50,50,PI*0.75,PI*2.25);
    strokeWeight(5);
   fill(a,b,0);
 arc(540,frameCount,50,50,PI*0.75,PI*2.25);
 
 
 /* Then I create a ellipse,it will leave a trail on the backgroud
    What`s more, the trail which leave behind Pcl Man will be kept,But front one Will be cleared.
    
    */
 fill(random(255),random(255),random(255));
 ellipse(mouseX-0,mouseY-0,20,20);
 
 // Thank you for reading !!!!!!!!
 }
