import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class Person {
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "{" + "name = " + name + " age = " + age + "}";
    }
}

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ved", 19));
        people.add(new Person("Dev", 25));
        people.add(new Person("Raj", 20));
        System.out.println(people);

        ArrayList<Person> test = new ArrayList<>(people);

        // sort by age
        test.sort((person1, person2) -> {
            return person1.getAge() - person2.getAge();
        });
        // System.out.println(test);

        // more concise way
        test.clear();
        test.addAll(people);

        test.sort(Comparator.comparingInt(Person::getAge));
        System.out.println(test);

        // traverse
        Iterator<Person> it = test.iterator();
        // it = test.iterator (test.length-1);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
