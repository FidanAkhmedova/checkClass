package com.company;

import java.sql.Array;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(30, 50, 300, 3);
        Person person2 = new Person(20, 40, 200, 3);
        Person person3 = new Person(30, 10, 110, 5);

        Wall wall1 = new Wall(20);
        Wall wall2 = new Wall(20);
        Wall wall3 = new Wall(20);

        Treadmill treadmill1 = new Treadmill(300);

        Person[] participants = {person1, person2, person3};
        int[][] obstacles = {{10, 20}, {50, 30}, {20, 20}};

        for (int i = 0; i < participants.length; i++) {
                if (person1.stepHeight >= obstacles[i][0] && person1.stepLength >= obstacles[i][1] && obstacles[i][1] < treadmill1.length) {
                    if (!participants[i].jump()) {
                        break;
                    }
                        participants[i].jump();
                        participants[i].run();
                }
                else break;
        }
    }
}
