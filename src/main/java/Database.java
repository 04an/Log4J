import java.util.HashMap;
import java.util.Map;

public class Database<T>{

   private Map<Integer,T> database = new HashMap <>();
   private int id =0;
//dodanie danych
    public int add(T t){
        this.database.put(++id,t);
        return id;
    }
// pobrania danych
    public T getById (int id){
        return database.get(id);
    }
    // metoda do usuwania
    public void  remove (int id ){
        database.remove(id);
    }

}
