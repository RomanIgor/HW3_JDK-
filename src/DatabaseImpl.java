import java.util.ArrayList;
import java.util.List;

public class DatabaseImpl  implements DatabaseStorage{

List<Person>database = new ArrayList<>();
    @Override
    public void saveData(Person person) {
        database.add(person);

    }

    @Override
    public void deleteData(Person person) {
        database.remove(person);
    }

    @Override
    public Person getDataById(int id) {
        for (Person item:database) {
            if (item.getId()==id){
                return item;
            }
        }
        return null;
    }
    @Override
    public List<Person> getAllPersons() {
        return database;
    }
}