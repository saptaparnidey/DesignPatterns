package designpatterns.singleton;

public class DBConnMultiThreading {

    private static DBConnMultiThreading instance = null;

    private DBConnMultiThreading(){
        System.out.println("DBConnMultiThreading constructor initiated");
    }

    public static DBConnMultiThreading getInstance() {
        if(instance == null){
            synchronized (DBConnMultiThreading.class) {
                if (instance == null) {
                    instance = new DBConnMultiThreading();
                }
            }
        }
        return instance;
    }
}
