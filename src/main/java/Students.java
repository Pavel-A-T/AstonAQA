import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class Students {
    Collection<Student> students = Arrays.asList(new Student("Дмитрий", 17, Gender.MAN),
            new Student("Максим", 20, Gender.MAN),
            new Student("Екатерина", 20, Gender.WOMAN),
            new Student("Михаил", 28, Gender.MAN));

     Students() {
         double aver = this.students.stream().filter(o -> o.getGender() == Gender.MAN).collect(Collectors.averagingInt(Student::getAge));
        System.out.printf("Средний возраст: %f\n", aver);
        System.out.println("Кому из студентов грозит получение повестки:");
        this.students.stream().filter(o -> o.getGender() == Gender.MAN && o.getAge() >= 18 && o.getAge() <= 27).forEach(System.out::println);
    }

    private enum Gender {
        MAN, WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
