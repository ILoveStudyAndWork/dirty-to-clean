package loops;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;

public class UsePipelineReplaceLoops {

    public static void main(String[] args) {
        prepareStudents().stream()
                .filter(student -> student.getName().startsWith("A"))
                .max(Comparator.comparing(Student::getAge))
                .ifPresent(oldestStudent ->
                        System.out.printf("Oldest student:%s, age: %d", oldestStudent.getName(), oldestStudent.getAge()));
    }

    public static List<Student> prepareStudents() {
        return Lists.newArrayList(new Student("Angle", 15),
                new Student("Alex", 16),
                new Student("Bob", 7),
                new Student("Alan", 14),
                new Student("Carl", 19),
                new Student("Kiki", 10),
                new Student("Andre", 6)
        );
    }
}
