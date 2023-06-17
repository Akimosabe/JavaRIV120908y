package lr13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example6 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int sum = calculateParallelSum(array);
        System.out.println("Сумма элементов в массиве: " + sum);
    }

    public static int calculateParallelSum(int[] array) {
        // Определение количества доступных процессоров
        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
        // Создание потоков фиксированного размера
        ExecutorService executor = Executors.newFixedThreadPool(numberOfProcessors);
        // Определение размера массива для обработки потоками
        int chunkSize = array.length / numberOfProcessors;
        // Создание массива для хранения частей
        int[] partialSums = new int[numberOfProcessors];

        // Запуск потоков для обработки частей
        for (int i = 0; i < numberOfProcessors; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numberOfProcessors - 1) ? array.length : (i + 1) * chunkSize;
            int threadIndex = i;

            executor.execute(() -> {
                int partialSum = 0;
                // Вычисление суммы для каждого потока
                for (int j = startIndex; j < endIndex; j++) {
                    partialSum += array[j];
                }
                // Сохранение суммы в массиве
                partialSums[threadIndex] = partialSum;
            });
        }

        // Завершение работы потоков
        executor.shutdown();
        try {
            // Ожидание завершения всех потоков
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вычисление общей суммы на основе частей
        int sum = 0;
        for (int partialSum : partialSums) {
            sum += partialSum;
        }
        return sum;
    }
}