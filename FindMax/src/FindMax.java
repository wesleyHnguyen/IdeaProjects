import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = getSize(scanner);
        int[] array = new  int[size];

        initalizeArray(array,scanner);

        printList(array);

        int index = Max(array);


        System.out.println("The largest property value in the list is " + array[index] + " ,at position " + (index+1));

    }

    private static int getSize(Scanner scanner){
        int size;
        do{

            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size > 20)
                System.out.println("Size should not be exceed 20");
        }while (size > 20);

        return size;
    }

    private static void initalizeArray(int[] array,Scanner scanner){
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

    }

    private   static  void printList(int[] array){
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    private static int Max(int[] array){
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }

        return index;
    }

}
