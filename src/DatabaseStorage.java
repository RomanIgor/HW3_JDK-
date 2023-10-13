import java.util.List;

public interface DatabaseStorage {

    boolean saveData(Object data);


    boolean deleteData(Object data);


    Object getDataById(int id);


    List<Object> getAllData();


}

