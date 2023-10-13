import java.util.List;

public interface DatabaseStorage {

    void saveData(Person person);

    void deleteData(Person person);

    Person getDataById(int id);

    List<Person> getAllPersons();


}

