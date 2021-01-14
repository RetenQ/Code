import java.io.StringWriter;

float X=200; // Origin : Note we have now centred the origin in the X-direction 
float Y=350;
float ax=300; // Vector a resolved into components 
float ay=-100; 
float bx=0; // Vector b resolved into components
float by=-300;
Matrix a; 
Matrix b;
void setup() {
size(400,400); // Create a drawing window
strokeWeight(3); // Make pen 3 pixels wide for all lines
double [][] anums = {{ax}, {ay}};
double [][] bnums = {{bx}, {by}};
a = new Matrix(anums); b = new Matrix(bnums);
}

void draw() {


// Evaluate equation (1.5)

// STEP1: Insert code here that computes a_unit (i.e. the unit vector in the  direction of a
double lengtha = a.norm2();//计算A的模长
Matrix a_unit = a.times(1/lengtha);//得到单位向量

// STEP2: Insert code here to compute the dot product of b and a_unit
Matrix a_unit2 = a_unit.transpose();
Matrix amat = a_unit2.times(b);//点乘
double dot_ab = amat.get(0,0);

// STEP3: Insert code here to compute the vector p using equation 1.5 above
Matrix p = a_unit.times(dot_ab);


float px = (float)p.get(0,0);
float py = (float)p.get(1,0); 
float ax = (float)a.get(0,0);
float ay = (float)a.get(1,0);
float bx = (float)b.get(0,0);
float by = (float)b.get(1,0);
// Draw the projection of b onto a 

stroke(0,0,0);// Use a black pen 
ellipse(X+px,Y+py,10,10); // point where b projects onto a 
line(X+px,Y+py,X+bx,Y+by); // line from a to point of projection on b
stroke(255,0,0); // Make pen red 
arrow(X,Y,X+ax,Y+ay); // Draw vector a starting at (X,Y) 
stroke(0,255,0); // Make pen green 
arrow(X,Y,X+bx,Y+by); // Draw vector b starting at (X,Y)

//S4
 float cx=ay;
 float cy=-ax;
 double [][] cnums = {{cx},
 {cy}};
 Matrix c=new Matrix(cnums);
 stroke(0,0,255);
 arrow(X,Y,X+cx,Y+cy);

//S5


if (mouseButton == RIGHT){ 
  a.set(0,0,(double)mouseX-X);
  a.set(1,0,(double)mouseY-Y); 
}
if (mouseButton == LEFT){
  b.set(0,0,(double)mouseX-X); 
  b.set(1,0,(double)mouseY-Y); 
}

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
