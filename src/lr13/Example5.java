package lr13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example5 {
    public static int findMax(int[] arr) {
        // Определяем количество доступных процессоров
        int numberOfProcessors = Runtime.getRuntime().availableProcessors();

        // Создаем пул потоков
        ExecutorService executor = Executors.newFixedThreadPool(numberOfProcessors);

        // Массив для хранения результатов выполнения задач
        int[] results = new int[numberOfProcessors];

        // Разделяем массив на части и обрабатываем каждую часть в отдельном потоке
        int chunkSize = arr.length / numberOfProcessors;
        for (int i = 0; i < numberOfProcessors; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numberOfProcessors - 1) ? arr.length : (i + 1) * chunkSize;

            int finalI = i;
            executor.execute(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = startIndex; j < endIndex; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                results[finalI] = max;
            });
        }

        // Завершаем выполнение потоков в пуле
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Находим максимальный элемент среди результатов выполнения задач
        int max = Integer.MIN_VALUE;
        for (int result : results) {
            if (result > max) {
                max = result;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 3, 10, 4};
        int max = findMax(arr);
        System.out.println("Max: " + max);
    }
}