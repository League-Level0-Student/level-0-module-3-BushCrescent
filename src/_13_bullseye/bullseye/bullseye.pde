void setup(){
size(1000,1000);
}
void draw(){
for( int i=0; i<10 ; i++){
  ellipse(500,500,100-(10*i),100-(10*i));
  if(i % 2 == 0){
  fill(0,0,0);
  }else{
  fill(250,0,0);
  }
}
}
