public class TestPointMovement {

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2.4f,3.6f,1.2f,1.2f);

        System.out.println(moveablePoint.toString());

        System.out.println(moveablePoint.move().toString());

    }
}
