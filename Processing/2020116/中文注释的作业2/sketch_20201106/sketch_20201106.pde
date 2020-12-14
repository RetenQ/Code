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

float mag=sqrt(pow(ax,2)+pow(ay,2)); // 计算出A这条线的长度
float component=dot/mag; // 计算出投影的长度

float axu = ax / mag; // 计算A在x方向的单位向量
float ayu = ay / mag; // 计算A在y方向的单位向量

float px=component * axu; 
float py=component * ayu; 
//计算向量p在x,y方向上的坐标 ，得到了P点，P是B在A上的投影点
  
background(255); 
stroke(255,0,0); 
arrow(X,Y,X+ax,Y+ay); //画出向量A的箭头
stroke(0,255,0); 
arrow(X,Y,X+bx,Y+by); // 画出向量B的箭头

// 画出b在a上的原点
stroke(0,0,0); 
ellipse(X+px,Y+py,10,10); //点出P点
line(X+px,Y+py,X+bx,Y+by); // 画线


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
//利用改变axy,bxy的值改变箭头。mouseX-X得到的是A点新的X坐标











//打印出长度和角度
float len=sqrt((px*px)+(py*py));
float ang=180*atan2(py,px)/PI;
textSize(18);
fill(0,0,255);
text("Angle:"+round(ang),250,20);
text("Length:"+round(len),250,50);

}
//画箭头
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
