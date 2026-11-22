package practice20;

public class Tester5 {
    public static void main(String[] args) {
        Integer[][] firstData = {{1, 2}, {3, 4}};
        Integer[][] secondData = {{5, 6}, {7, 8}};
        Matrix<Integer> first = new Matrix<>(firstData);
        Matrix<Integer> second = new Matrix<>(secondData);

        System.out.println("Первая матрица:");
        first.print();
        System.out.println("Вторая матрица:");
        second.print();

        System.out.println("Сумма матриц:");
        first.add(second).print();

        System.out.println("Произведение матриц:");
        first.multiply(second).print();

        System.out.println("Транспонированная первая матрица:");
        first.transpose().print();

        System.out.println();
        Double[][] doubleData = {{1.5, 2.5}, {3.5, 4.5}};
        Matrix<Double> doubleMatrix = new Matrix<>(doubleData);
        System.out.println("Вещественная матрица, умноженная на себя:");
        doubleMatrix.multiply(doubleMatrix).print();
    }
}
