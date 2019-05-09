public class MoveablePoint extends Point {
    private float x = 0.0f;
    private float y = 0.0f;
    private  float speedX;
    private float speedY;

   public MoveablePoint(){

   }

   public MoveablePoint(float speedX, float speedY){
       this.speedX = speedX;
       this.speedY = speedY;
   }

   public MoveablePoint(float x,float y, float speedX, float speedY){
       this.x = x;
       this.y = y;
       this.speedX = speedX;
       this.speedY = speedY;
   }

    public  void setX(float x){
       this.x = x;
    }

    public  float getX(){
       return this.x;
    }

    public  void setY(float y){
        this.y = y;
    }

    public  float getY(){
        return this.y;
    }



    public void setXY(float x, float y){
       this.x = x;
       this.y = y;
   }



   public void setSpeedX(float speedX){
       this.speedX = speedX;
   }

   public float getSpeedX(){
       return this.speedX;
   }
   public void setSpeedY(float speedY){
       this.speedY = speedY;
   }

   public float getSpeedY(){
       return this.speedY;
   }

   public void setSpeed(float speedX, float speedY){
       this.speedX = speedX;
       this.speedY = speedY;
   }

    public float[] getSpeed(){
        float[] speedXY = new float[2];
        speedXY[0] = this.getSpeedX();
        speedXY[1] = this.getSpeedY();
        return speedXY;
    }

    @Override
    public String toString(){
       return "(" + this.x + "," + this.y + ")" + ", speed = " + "(" + this.speedX +
       "," + this.speedY + ")";
    }

    public MoveablePoint move(){
       this.x += this.speedX;
       this.y += this.speedY;
       return this;
    }

}
