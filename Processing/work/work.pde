int x=380; 
int y=150; 
int direction_x=2; 
int direction_y=2; 
int lives=3;
int score=0;
//Set the Basic variable.


void setup()
{
 size(400,400); 
}
void draw()
{
 background(255,255,255); 
 fill(0,255,0); 
 rect(0,mouseY-60,20,120); 
 // Have the paddle moving vertically instead of horizontally but with thesame game logic. 

 fill(255,0,0);
 ellipse(x,y,20,20); 
 
 
 x=x+direction_x; 
 if(x<20){
   y=mouseY;//!!!!!!!!!!!!!!
   direction_x=-direction_x;
   lives--;
  if(lives==0)exit();
  } 
 if(x>(width-10)) direction_x=-direction_x;
 if((x<30)&&(abs(mouseY-y)<60)) // If ball has bit paddle then..
 {
 direction_x=-direction_x; // Bounce
 score++; // Increase score by one
 }
//Set  X and the change of lives and score

 y=y+direction_y;
 if(y<10) direction_y=-direction_y;
 if(y>(height-10)) direction_y=-direction_y; 
//Set Y
 

 textSize(32);
 fill(0,0,255);
 text("score: "+ score, 10, 30); // Display score
 text("lives:"+lives,width-150, 30); // Display lives
} 
