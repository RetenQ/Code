/*1.different ciloured primitives
  2.object should move
  3.Using random or mouse input
  4.Using the frame counter
*/

void setup()
{
size(500,500);
//Firstly,I creat a window which is 500X500

background(0,0,0);
/*And the background is white
  When"background" is written here,it can help me keep the background white
  */
  fill(255,255,255);
 rect(random(500),random(500),10,10);
  

}

void draw()
{

 
  

  
  fill(0,0,0);
  strokeWeight(10);
  arc(mouseX-0,mouseY-0,100,100,PI,TWO_PI);
  //I create a "Bean eater" and it's yellow
}
