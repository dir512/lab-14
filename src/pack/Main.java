import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите нечетный размер квадратной матрицы больший 3х3:\n");
        Scanner scan1 = new Scanner(System.in);
        String rows_columns1 = scan1.next();

        System.out.println("Введите максимальное значение элементов квадратной матрицы:\n");
        Scanner scan2 = new Scanner(System.in);
        String max = scan2.next();

        System.out.println("Введите минимальное значение элементов квадратной матрицы:\n");
        Scanner scan3 = new Scanner(System.in);
        String min = scan3.next();

        if (Integer.parseInt(rows_columns1) <= 3 || Integer.parseInt(rows_columns1)%2 == 0) {
            System.out.println("Вы ввели неправильное количество строк и столбцов квадратной матрицы, перезапустите программу!\n");
        } else {
            Matrix m = new Matrix(Integer.parseInt(rows_columns1),Integer.parseInt(rows_columns1),Integer.parseInt(max),Integer.parseInt(min));
            ArrayList<ArrayList<Float>> matrix = m.get_matrix();
            System.out.println("Матрица с большим средним значением (главной, либо побочной) диагонали в центре:\n");
            for (ArrayList<Float> r: matrix) {
                System.out.print(r + "\n");
            }
        }
    }
}
