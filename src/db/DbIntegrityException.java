package db;

public class DbIntegrityException extends RuntimeException{

    private static Long serialVersionUID = 1L;

    public DbIntegrityException(String msg){
        super(msg);
    }
}
