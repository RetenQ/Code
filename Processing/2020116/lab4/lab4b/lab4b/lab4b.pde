import java.io.StringWriter;
/*A线  红
  B线  绿
  C线  蓝
*/

float X=150; // 设置坐标系原点
float Y=350;

float ax=300; // 表达A点
float ay=-100; 

float bx=0; // 表达B点
float by=-300;

Matrix a; Matrix b;//声明数组ab

void setup() {
size(400,400); 
strokeWeight(3); 

double [][] anums = {{ax}, {ay}};
double [][] bnums = {{bx}, {by}};
a = new Matrix(anums); b = new Matrix(bnums); 
//初始化数组ab

}

void draw ()
{
  background(255);
  
// Evaluate equation (1.5) 

// STEP1: Insert code here that computes a_unit (i.e. the unit vector in the direction of a
double length = a.norm2();
Matrix a_unit = a.times(1/length);//计算A的单位向量


// STEP2: Insert code here to compute the dot product of b and a_unit
Matrix a_unitB = a_unit.transpose();//转换A的单位向量

Matrix a_mat = a_unitB.times(b);//计算相乘

double dot = a_mat.get(0,0); //定义并赋值点乘结果


// STEP3: Insert code here to compute the vector p using equation 1.5 above
 Matrix p = a_unit.times(dot); //得到P点


float px = (float)p.get(0,0); 
float py = (float)p.get(1,0);
float ax = (float)a.get(0,0); 
float ay = (float)a.get(1,0);
float bx = (float)b.get(0,0);
float by = (float)b.get(1,0);
 // Draw the projection of b onto a      
 stroke(0,0,0);
 ellipse(X+px,Y+py,10,10); 
 line(X+px,Y+py,X+bx,Y+by); 
//制作带箭头的ab线
 stroke(255,0,0);
 arrow(X,Y,X+ax,Y+ay); 
 stroke(0,255,0);   
 arrow(X,Y,X+bx,Y+by); 
 
// STEP 4. Insert code here to add a new vector at 90 degrees to the vector a 
 float cx=ay;
 float cy=-ax;//定义一个C点用于做线
 double [][] cnums = {{cx}, {cy}};//得到数组C
 Matrix c;
 c=new Matrix(cnums);//完成相关定义
 stroke(0,0,255);
 arrow(X,Y,X+cx,Y+cy);//画线
     
// STEP 5. Insert code here to compute and draw the projection of b onto c  
 double length_c = c.norm2();//用来得到C的模长
 Matrix c_unit = c.times(1/length_c);//得到C的单位向量，做法和Step1一样
 //和我们Step2-3一样，我们得到点乘，然后在得到一个点Q用来画线
 Matrix c_unitB= c_unit.transpose();
 Matrix c_mat = c_unitB.times(b);
 double dot_c = c_mat.get(0,0);
 Matrix q = c_unit.times(dot_c);
 
 float qx = (float)q.get(0,0);
 float qy = (float)q.get(1,0);//取得点Q的相关数值。
 
 //画线
 stroke(0,0,0);
 ellipse(X+qx,Y+qy,10,10); 
 line(X+qx,Y+qy,X+bx,Y+by); 

if (mouseButton == RIGHT) 
{  a.set(0,0,(double)mouseX-X); 
   a.set(1,0,(double)mouseY-Y);
}      
if (mouseButton == LEFT)
{ b.set(0,0,(double)mouseX-X); 
b.set(1,0,(double)mouseY-Y);   
} 
      
}

// Draw an arrow from (x1,y1) to (x2,y2)    
void arrow(float x1, float y1, float x2, float y2){
line(x1, y1, x2, y2);
pushMatrix();
translate(x2, y2);   
float a = atan2(x1-x2, y2-y1);   
rotate(a);   
line(0, 0, -8, -8);   
line(0, 0, 8, -8);   
popMatrix(); 
} 
