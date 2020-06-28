package ru.gb.lesson1;

public class Team {

    String teamName;
    Competitor[] team;

    public Team(String teamName, Competitor... member) {
        this.teamName = teamName;
        team = member;
    }

    public void getInfoAboutSuccessfulCompetitors() {
        System.out.println("========================");
        System.out.println("Дистанцию успешно прошли:");
        for (Competitor c : team) {
            if (c.isOnDistance()) {
                c.info();
            }
        }
        System.out.println("========================");
    }

    public void getInfoAboutAllCompetitors() {
        for (Competitor c : team) {
            c.info();
        }
    }
}
