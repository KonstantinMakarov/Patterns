package closures;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 26-Nov-15.
 */
public class MainClosuresOrCallbackMethod {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person vladimir = new Person("Vladimir");
        persons.add(new Person("Vladimir"));
        persons.add(new Person("Kostya"));
        persons.add(new Person("Vladimir"));

        //how programmers wrote before lambda
        int closuresCopies = EqualCounterUtil.countDuplicates(persons, vladimir, new Equalator<Person>() {
            @Override
            public boolean isEquals(Person firstObject, Person secondObject) {
                return firstObject.getName().equals(secondObject.getName());
            }
        });
        System.out.println(closuresCopies);

        // when java8 included lambda
        int java8Copies = EqualCounterUtil.countDuplicates(persons, vladimir,
                (Person first, Person second) -> first.getName().equals(second.getName()));
        System.out.println(java8Copies);
    }

}
