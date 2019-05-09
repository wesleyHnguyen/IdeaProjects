public class Point {
    private float x;
    private  float y;

    public Point(){

    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;

    }

    public void setX(float x){
        this.x = x;
    }

    public  float getX(){
        return this.x;
    }

    public void setY(float y){
        this.y = y;
    }

    public  float getY(){
        return this.y;
    }


    public  void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] varGetXY = new float[2];
        varGetXY[0] = this.x;
        varGetXY[1] = this.y;

        return varGetXY;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

}

