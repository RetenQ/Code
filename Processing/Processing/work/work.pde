int x=380; 
int y=150; 
int direction_x=5; 
int direction_y=5; 
int lives=3;
int score=0;
//Set the Basic variable.
float a=0,b=0,c=255,d=0,e=0,f=0;

void setup()
{
 size(400,400); 

}
void draw()
{
  strokeWeight(0);
 fill(a,b,c); 
 rect(0,mouseY-60,20,120); 
 // Have the paddle moving vertically instead of horizontally but with thesame game logic. 
 strokeWeight(0);
 fill(d,e,f);
 ellipse(x,y,20,20); 
 
 
 x=x+direction_x; 
 if(x<20){
   direction_x=-direction_x;
   lives--;
    background(155,155,155); 

  if(lives==0)exit();
  x=30;y=mouseY;
  //With this commond,we can not only fix the bug of score,But also the ball will appear in front of paddle when the live is lost.
  } 
 if(x>(width-10)) direction_x=-direction_x;
 if((x<30)&&(abs(mouseY-y)<60))
 {
 direction_x=-direction_x; 
 score++; 
  background(155,155,155); 

 a=random(156,255);
 b=random(156,255);
 c=random(156,255);
 d=random(0,155);
 e=random(0,155);
 f=random(0,155);
 //Something interesting
 }
//Set  X and the change of lives and score

 y=y+direction_y;
 if(y<10) direction_y=-direction_y;
 if(y>(height-10)) direction_y=-direction_y; 
//Set Y 's .
 

 textSize(32);
 fill(0,0,255);
 text("score: "+ score, 10, 30); 
 text("lives:"+lives,width-150, 30);
 
 if(score>9){
 score=score-10;
 lives++;
 }
 //That's all
} 
