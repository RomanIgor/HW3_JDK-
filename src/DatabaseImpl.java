import java.util.ArrayList;
import java.util.List;

public class DatabaseImpl  implements DatabaseStorage{

    private final List<Object> database;

    public DatabaseImpl() {
        database = new ArrayList<>();
    }

    @Override
    public boolean saveData(Object data) {
        return database.add(data);
    }

    @Override
    public boolean deleteData(Object data) {
        return database.remove(data);
    }

    @Override
    public Object getDataById(int id) {
        for (Object item : database) {
            if (item instanceof Person person) {
                if (person.getId() == id) {
                    return person;
                }
            }
        }
        return null;
    }


    @Override
    public List<Object> getAllData() {
        return database;
    }


}