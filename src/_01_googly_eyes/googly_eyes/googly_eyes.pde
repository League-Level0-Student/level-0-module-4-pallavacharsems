PImage face;
void setup() {
 face = loadImage("Spongebob.png");
  size(800, 600);
  face.resize(width, height);
  
}

void draw() {
 background(face);
  fill (#FFFCFC);
  ellipse (312, 205, 175, 215);
  fill (#050505);
    if (mouseX < 269 ){
      mouseX = 269; 
    }
  if (mouseX > 358 ){
      mouseX = 358; 
    }
   if (mouseY < 162 ){
      mouseY = 162; 
    }
   if (mouseY > 246 ){
      mouseY = 246; 
    }
  ellipse (mouseX, mouseY, 80, 120);
  println (mouseX, mouseY);
 

fill (#FFFCFC);
ellipse( 472, 205, 175, 215);
fill(#000000);
ellipse (mouseX+125, mouseY, 80, 120);




}
