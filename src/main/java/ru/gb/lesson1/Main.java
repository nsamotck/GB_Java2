package ru.gb.lesson1;


public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Спартак", new Cat("Барсик"), new Dog("Мухтар"), new Human("Вася"), new Animal("SomeKindOfAnimal", "Underdog", 1000, 30, 1000));
        Course course1 = new Course(new Cross(1000), new Wall(10), new Cross(500), new Water(500));

        course1.go(team1);

        team1.getInfoAboutSuccessfulCompetitors();
        team1.getInfoAboutAllCompetitors();
    }
}