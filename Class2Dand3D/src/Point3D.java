import java.util.Arrays;

public class Point3D extends Point2D {

    private float x;
    private float y;
    private float z;

    public  Point3D(){

    }

    public  Point3D(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public float getZ(){
        return this.z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] varGetXYZ = super.getXY();
        varGetXYZ = Arrays.copyOf(varGetXYZ,varGetXYZ.length + 1);
        varGetXYZ[varGetXYZ.length - 1] = this.z;
        return  varGetXYZ;
    }

    @Override
    public String toString(){
        return "(" + this.getX() + "," + this.getY() + "," + this.z + ")";
    }

}
