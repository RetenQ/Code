float X=50; // 定义向量原点
float Y=350;
float ax=300; // 定义a，a由ax和ay构成 就是 A（ax,ay）
float ay=-100;
float bx=0; // 同样定义b
float by=-300;


void setup()
{
size(400,400); 
strokeWeight(3); 
}


void draw()
{

float dot=(ax*bx)+(ay*by); //设置ab的点乘
float mag=sqrt(pow(ax,2)+pow(ay,2)); // length (magnitude) of a
float component=dot/mag; // find length of projection
float axu = ax / mag; // compute x component of unit vector a
float ayu = ay / mag; // compute y component of unit vector a
float px=component * axu; // x component of vector projection
float py=component * ayu; // y component of vector projection
  
  
background(255); // Clear screen
stroke(255,0,0); // Make pen red
arrow(X,Y,X+ax,Y+ay); // Draw vector a starting at (X,Y)
stroke(0,255,0); // Make pen green
arrow(X,Y,X+bx,Y+by); // Draw vector b starting at (X,Y)

// Draw the projection of b onto a
stroke(0,0,0); // Use a black pen
ellipse(X+px,Y+py,10,10); // point where b projects onto a
line(X+px,Y+py,X+bx,Y+by); // line from a to point of projection on b

if (mouseButton == RIGHT)
{
ax=mouseX-X;
ay=mouseY-Y;
}
if (mouseButton == LEFT)
{
bx=mouseX-X;
by=mouseY-Y;
}


//打印出长度和角度
float len=sqrt((px*px)+(py*py));
float ang=180*atan2(py,px)/PI;
textSize(18);
fill(0,0,255);
text("Angle:"+round(ang),250,20);
text("Length:"+round(len),250,50);



}
// Draw an arrow from (x1,y1) to (x2,y2)
void arrow(float x1, float y1, float x2, float y2)
{
line(x1, y1, x2, y2);
pushMatrix();
translate(x2, y2);
float a = atan2(x1-x2, y2-y1);
rotate(a);
line(0, 0, -8, -8);
line(0, 0, 8, -8);
popMatrix();
}
