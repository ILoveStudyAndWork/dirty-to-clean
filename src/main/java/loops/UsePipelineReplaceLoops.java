package loops;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;

public class UsePipelineReplaceLoops {

    // Requirement find the oldest students whose name start with A
    public static void main(String[] args) {
        // prepare student list
        List<Student> students = prepareStudents();
        int maxMge = 0;
        Student oldestStudent = null;
        for (Student student : students) {
            // filter the student whose name start with A
            if (student.getName().startsWith("A")) {
                if (student.getAge() > maxMge) {
                    maxMge = student.getAge();
                    oldestStudent = student;
                }
            }
        }
        // print the information of the oldest student if present
        if (Objects.nonNull(oldestStudent)) {
            System.out.printf("Oldest student:%s, age: %d", oldestStudent.getName(), oldestStudent.getAge());
        }
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
