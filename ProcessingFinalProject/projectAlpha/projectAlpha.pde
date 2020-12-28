int savetime ; //运行总时间
int mousePresstime ; //点击记录时，每次点击鼠标时更新

int score = 0 ; //

boolean press = false;

int locationx = 150 ; 
int locationy = 200 ; 
int r = 75 ; //小球半径
int a = 0 ; //向上加速度 
int g = 10 ; //向下加速度

void setup() {
size(2000,1000);
  
}

void draw(){
 background(255,255,255); //设置背景
 savetime = millis() ;  //记录当前的时间
 
 //小球运动
 locationy = locationy + g +a ; //运动代码
 fill(255,0,0);
 ellipse(locationx,locationy,r,r); 
 //
 
 if(savetime >= (mousePresstime+750) ){
   //进行一次是否恢复下降状态的判定
  a = 0 ; 
  press =false ;
 }
 
 //打印分数 
 score = savetime/100 ; 
 textSize(100);
 text(score,500,500);
}

void mousePressed(){
  //鼠标点击时，进行判断
  if(press == false){
 a = -20 ;  
 mousePresstime  = millis();
 press =true ; 
 }else{
    a = 0 ; 
    press =false ;
  }
  
 
 }
