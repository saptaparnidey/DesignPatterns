package designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        // Single Threaded Singleton object call


        DBConnectionSingleThread db1 = DBConnectionSingleThread.getInstance();
        DBConnectionSingleThread db2 = DBConnectionSingleThread.getInstance();
        DBConnectionSingleThread db3 = DBConnectionSingleThread.getInstance();

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);

        System.out.println("-------------------");

        // Multi Threaded Singleton object call

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> DBConnMultiThreading.getInstance());
        executorService.execute(() -> DBConnMultiThreading.getInstance());
        executorService.execute(() -> DBConnMultiThreading.getInstance());
        executorService.execute(() -> DBConnMultiThreading.getInstance());

        executorService.shutdown();
    }
}
