package classes;

@SuppressWarnings("unused")
public class Person  {
    private final String name;
    private final String lastname;
    private final byte age;

    private static String className = "PERSON";

    public Person(String name, String lastname, byte age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    void writePersonName(){
        onlyPerson();
    }

    void writeAllPersonData(){
        onlyPerson();
        System.out.println("Age: " + this.age);
    }

    void writeTheClassName(){
        System.out.println(Person.className);
    }

    private void onlyPerson() {
        System.out.println("Full name:" + this.name + " " + this.lastname);
    }

    static void setClassName(String className){
        Person.className = className;
    }

    @Override
    public String toString() {
        return """
            Person{
                name='%s',\s
                lastname='%s',\s
                age=%s
            }""".formatted(this.name,this.lastname,this.age);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        return lastname.equals(person.lastname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + (int) age;
        return result;
    }
}
