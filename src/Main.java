import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(5, "Igor");
        Person person1 = new Person(6,"Roman");
       DatabaseImpl database = new DatabaseImpl();
       database.saveData(person);
       database.saveData(person1);
       database.deleteData(person);
        List<Person>allPersons = database.getAllPersons();

        for (Person p:allPersons) {
            System.out.println(p);
        }
    }
}
