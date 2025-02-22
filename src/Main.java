import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("    Задача №1");
        int[] arrayInt = new int[] {1, 2, 3};
        float[] arrayFloat = new float[] {1.57F, 7.654F, 9.986F};
        boolean[] arrayBool = new boolean[] {true, false, true, true, false};

        //Задача №2
        System.out.println("    Задача №2");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        for (int i = 0; i < arrayFloat.length; i++) {
            if (i == arrayFloat.length - 1) {
                System.out.println(arrayFloat[i]);
            } else {
                System.out.print(arrayFloat[i] + ", ");
            }
        }
        for (int i = 0; i < arrayBool.length; i++) {
            if (i == arrayBool.length - 1) {
                System.out.println(arrayBool[i]);
            } else {
                System.out.print(arrayBool[i] + ", ");
            }
        }

        //Задача №3
        System.out.println("    Задача №3");
        int sortInt;
        for (int i = 0; i < arrayInt.length / 2; i++) {
            sortInt = arrayInt[i];
            arrayInt[i] = arrayInt[arrayInt.length - (i + 1)];
            arrayInt[arrayInt.length - (i + 1)] = sortInt;
            System.out.print(arrayInt[i] + ", ");
        }
        for (int i = arrayInt.length / 2; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        float sortFloat;
        for (int i = 0; i < arrayFloat.length / 2; i++) {
            sortFloat = arrayFloat[i];
            arrayFloat[i] = arrayFloat[arrayFloat.length - (i + 1)];
            arrayFloat[arrayFloat.length - (i + 1)] = sortFloat;
            System.out.print(arrayFloat[i] + ", ");
        }
        for (int i = arrayFloat.length / 2; i < arrayFloat.length; i++) {
            if (i == arrayFloat.length - 1) {
                System.out.println(arrayFloat[i]);
            } else {
                System.out.print(arrayFloat[i] + ", ");
            }
        }
        boolean sortBool;
        for (int i = 0; i < arrayBool.length / 2; i++) {
            sortBool = arrayBool[i];
            arrayBool[i] = arrayBool[arrayBool.length - (i + 1)];
            arrayBool[arrayBool.length - (i + 1)] = sortBool;
            System.out.print(arrayBool[i] + ", ");
        }
        for (int i = arrayBool.length / 2; i < arrayBool.length; i++) {
            if (i == arrayBool.length - 1) {
                System.out.println(arrayBool[i]);
            } else {
                System.out.print(arrayBool[i] + ", ");
            }
        }

        //Задача №4
        System.out.println("    Задача №4");
        //int[] arrayInt2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0 || arrayInt[i] == 1) {
                arrayInt[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}