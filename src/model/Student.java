package model;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private final int id;
    private final String name;
    private final double percentage;

    public Student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(percentage, student.percentage) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, percentage);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.id - o.id;
    }
}
