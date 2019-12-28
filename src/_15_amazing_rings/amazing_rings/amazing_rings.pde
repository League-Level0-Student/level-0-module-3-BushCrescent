int x = 250;
  int y = 500;
  int xx = 750;
  int yy = 500;
  int speedx = 1;
void setup(){
size(1000,1000);
}
void draw(){
  background(230,230,230);
  x = x+speedx;
  if(x >= 810){
speedx = -speedx;
}else if (x <= 190){
speedx = -speedx;
}
for( int i=0; i<50 ; i++){
  
  strokeWeight(1.5);
  noFill();
  ellipse(x,y,100-(10*i),100-(10*i));
  
} xx=xx-speedx;
if(xx >= 810){
speedx=-speedx;
}else if(xx <=190){
speedx=-speedx;
}
for( int i=0; i<50 ; i++){
  
  strokeWeight(1.5);
  noFill();
  ellipse(xx,yy,100-(10*i),100-(10*i));
  
} 

}
