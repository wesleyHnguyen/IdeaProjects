public class Class2Dand3D {

    public static void main(String[] args) {

        Point2D point2D = new Point2D(2.3f,4.5f);

        System.out.println(point2D.toString());

        point2D.setX(3.8f);
        point2D.setY(9.8f);
        System.out.println(point2D.toString());

        point2D.setXY(4.5f,8.9f);
        System.out.println(point2D.toString());

        float[] getXY2D = point2D.getXY();
        for (float point:getXY2D) {
            System.out.print(point + ",");
        }

        System.out.println();

        Point2D point3D = new Point3D();
        if (point3D instanceof Point3D){
            ((Point3D) point3D).setXYZ(1.5f,4.5f,6.5f);
            System.out.println(point3D.toString());
        }

    }
}
