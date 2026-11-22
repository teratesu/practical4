package practice20;

public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int columns;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Матрицы должны быть одного размера");
        }
        T[][] result = createResult(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = toT(data[i][j].doubleValue() + other.data[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (columns != other.rows) {
            throw new IllegalArgumentException(
                    "Число столбцов первой матрицы должно совпадать с числом строк второй");
        }
        T[][] result = createResult(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                double sum = 0;
                for (int k = 0; k < columns; k++) {
                    sum += data[i][k].doubleValue() * other.data[k][j].doubleValue();
                }
                result[i][j] = toT(sum);
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> transpose() {
        T[][] result = createResult(columns, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = data[i][j];
            }
        }
        return new Matrix<>(result);
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Тип T стирается, поэтому массив результата создаётся по типу исходных данных.
    @SuppressWarnings("unchecked")
    private T[][] createResult(int newRows, int newColumns) {
        if (data instanceof Integer[][]) {
            return (T[][]) new Integer[newRows][newColumns];
        }
        return (T[][]) new Double[newRows][newColumns];
    }

    @SuppressWarnings("unchecked")
    private T toT(double value) {
        if (data instanceof Integer[][]) {
            return (T) Integer.valueOf((int) value);
        }
        return (T) Double.valueOf(value);
    }
}
