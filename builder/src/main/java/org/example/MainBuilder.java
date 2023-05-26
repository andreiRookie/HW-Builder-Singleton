package org.example;

public class MainBuilder {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Svetlana")
                .setSurname("Petrova")
                .setAge(33)
                .setAddress("Tula")
                .build();

        Person daughter = mom.newChildBuilder()
                .setName("Alena")
                .build();

        System.out.println("У " + mom + " есть дочь:\n  " + daughter);

        try {
            new PersonBuilder().build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder()
                    .setName("Sasha")
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder()
                    .setName("Sasha")
                    .setSurname("Petrov")
                    .setAge(0)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println(new PersonBuilder()
                .setName("Sasha")
                .setSurname("Petrov")
                .setAge(10)
                .build());

        Person masha = new PersonBuilder()
                .setName("Masha")
                .setSurname("Petrova")
                .setAge(1)
                .setAddress("Rostov")
                .build();

        System.out.println(masha);
        masha.happyBirthday();
        System.out.println(masha);

    }
}