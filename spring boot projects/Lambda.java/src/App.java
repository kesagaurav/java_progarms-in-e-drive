import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Employee gaurav = new Employee("gaurav", 23);
        Employee deepa = new Employee("deepa", 49);
        Employee sri = new Employee("sri", 24);
        Employee sri1 = new Employee("sri1", 12);
        List<Employee> list = new ArrayList<>();
        list.add(gaurav);
        list.add(deepa);
        list.add(sri);
        list.add(sri1);
        list.stream().flatMap(list1 -> list1.getName().lines());
        list.forEach(e -> System.out.println(e));
        list.forEach(e -> {
            if (e.getAge() > 18) {
                System.out.println(e.getName());
            } else if (e.getAge() <= 18) {
                System.out.println(e.getName());
            }
        });
        // list.stream().flatMap(e -> e.getName().stream()).forEach(System.in::println);
        Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));

    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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

    @Override
    public String toString() {
        return "Employee [age=" + age + ", name=" + name + "]";
    }

}
