/*
Lan.Hongyi

*/




  
  // I want to make a n animation like Pac-Man.
  void setup()
  {
  size(550,550);
  background(0,0,100);
 
    
  fill(random(255),random(255),random(255));  
  rect(random(500),random(500),20,20);   //create a rectangle,and its color and location are random.
  
   /* When I first time code the project, I want to use many commands like this to create many rectangles to achieve the goals
    I hope things don`t come back when they are lost
    And then I find  a better way(From 47th to 55th row).
    */


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
   
   // I create some texts firstly.And these texts aren't eaten
   
   
   float c=random(0,150);
   float d=random(0,150);
   strokeWeight(0);
   fill(200,200,0);
   ellipse(c+frameCount,d+frameCount,15,15);
   
  /*
   Use these commands,I create things which will be eaten by Pac-Man.
   And when they are eaten,they don`t show up again!
   Their locations are random ,But they will appear from top left to bottom right.(thanks to framecount)
   */
   
   float a=random(255);
   float b=random(255);
  //Then I set some variables so that next step will be more convenient.
  
  /*I use the "arc" to create the Pac-Man,and they will eat the ellipses.
    At the same time.they will keep the texts and their color are random.
    please read from 117th row.   
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
    What's more, the trail which leave behind Pcl Man will be kept,But front one Will be cleared.
    And when you pressed mouse , it will get a random color.
    */
    strokeWeight(0);
    if(mousePressed)
 {
   fill(random(255),random(255),random(255));
 }
 else 
 {
   fill(0,0,0);
 }
 ellipse(mouseX-0,mouseY-0,20,20);
 
 
 
   //Finally,I want to create a Meteoric shower,maybe.//
   
   float c1= 255 ;
   float c2= 255 ;
   float c3= 155 ;
   
 strokeWeight(0);
 fill(c1,c2,c3);
 ellipse(20+frameCount,50+frameCount,20,20);
// Use that,I create a "star" and it is easy to copy andrevise

 fill(c1,c2,c3);ellipse(120+frameCount,150+frameCount,20,20); 
 fill(c1,c2,c3);ellipse(70+frameCount,50+frameCount,20,20); fill(c1,c2,c3);
 ellipse(20+frameCount,250+frameCount,20,20); fill(c1,c2,c3);
 ellipse(10+frameCount,170+frameCount,20,20); fill(c1,c2,c3);
 ellipse(90+frameCount,50+frameCount,20,20); fill(c1,c2,c3);
 ellipse(80+frameCount,50+frameCount,20,20); fill(c1,c2,c3);
 ellipse(30+frameCount,100+frameCount,20,20); fill(c1,c2,c3);
 ellipse(20+frameCount,200+frameCount,20,20); fill(c1,c2,c3);
 ellipse(200+frameCount,175+frameCount,20,20); fill(c1,c2,c3);
 ellipse(120+frameCount,150+frameCount,20,20);
   
 
 // Thar's all. Thank you for reading 
 }
 
 
 
 
 // First author :Lan.Hongyi
