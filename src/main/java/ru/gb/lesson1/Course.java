package ru.gb.lesson1;

public class Course {

    Obstacle[] obstacles;

    public Course(Obstacle... obstacle) {
        obstacles = obstacle;
    }

    public void go(Team team) {
        for (Competitor c : team.team) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
