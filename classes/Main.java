package classes;

public class Main {
    public static void main(String[] args) {

        Person onePerson = new Person("Neal", "Stephenson", (byte) 60);
        Person secondPerson = new Person("Neal", "Stephenson", (byte) 61);

        System.out.println(onePerson.toString());
        System.out.println(onePerson.hashCode());
        System.out.println(onePerson.equals(secondPerson));


    }

}
