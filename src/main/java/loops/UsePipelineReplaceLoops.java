package loops;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;

public class UsePipelineReplaceLoops {

    public static void main(String[] args) {
        List<Student> students = prepareStudents();
        List<Student> qualifiedStudents = getQualifiedStudents(students);
        Student oldestStudent = getOldestStudent(qualifiedStudents);
        if (Objects.nonNull(oldestStudent)) {
            System.out.printf("Oldest student:%s, age: %d", oldestStudent.getName(), oldestStudent.getAge());
        }
    }

    private static Student getOldestStudent(List<Student> qualifiedStudents) {
        int maxMge = 0;
        Student oldestStudent = null;
        for (Student student : qualifiedStudents) {
            if (student.getAge() > maxMge) {
                maxMge = student.getAge();
                oldestStudent = student;
            }
        }
        return oldestStudent;
    }

    private static List<Student> getQualifiedStudents(List<Student> students) {
        List<Student> qualifiedStudents = Lists.newArrayList();
        for (Student student : students) {
            if (student.getName().startsWith("A")) {
                qualifiedStudents.add(student);
            }
        }
        return qualifiedStudents;
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
