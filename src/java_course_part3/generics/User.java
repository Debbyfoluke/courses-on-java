package java_course_part3.generics;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User>, Cloneable {
    private int points;

    public User(int points) {
        this.points = points;
    }
    @Override
    public int compareTo(@NotNull User user) {
        return points - user.points;
    }

    @Override
    public String toString() {
        return "Points=" + points;
    }
}
