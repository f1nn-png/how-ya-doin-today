void setup(){
size(400,200); 

    rect(10,10,375,175);
    rect(170,140,70,40);
    rect(10,10,65,40);
    fill(10,10,10);
    textSize(30);
    text("yo, how be it?", 120,110);
    text("joe",20,40);
    fill(0,100,0);
    text("G",175,170);
    fill(10,10,10);
    text("/",202,170);
    fill(100,10,10);
    text("B",220,170);
}

void draw(){
  
   if(key == 'g'){
     fill(1000,1000,1000);
     rect(10,10,375,175);
     rect(10,10,65,40);
     fill(10,10,10);
     textSize(30);
     text("epic :D", 150,110);
     text("joe",20,40);
   }else{
     println("");
      }
      if(key == 'b'){
            fill(1000,1000,1000);
            rect(10,10,375,175);
            rect(10,10,65,40);
            fill(10,10,10);
            textSize(30);
            text("aw, thats too bad :(", 90,110);
            text("joe",20,40);
      }else{
        println("");
      }
}