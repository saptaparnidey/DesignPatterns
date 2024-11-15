package designpatterns.singleton;

public class DBConnectionSingleThread {

    private static DBConnectionSingleThread instance = null;

    private DBConnectionSingleThread(){

    }

    public static DBConnectionSingleThread getInstance() {
        if(instance == null){
            instance = new DBConnectionSingleThread();
        }
        return instance;
    }
}
