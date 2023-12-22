package v17.record;

public class App {

    public static void main(String[] args) {
        PersonRecord person = new PersonRecord("record name", 18);

        String name = person.name();
        Integer age = person.age();

        System.out.println(person);
    }

}
