package org.example;

public class PersonBuilder implements IPersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        if (age < 1) {
           throw new IllegalArgumentException("Person's age cannot be equals or less than 0");
        }
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Person's name must not be null or empty");
        } else if (surname == null || surname.equals("")) {
            throw new IllegalArgumentException("Person's surname must not be null or empty");
        } else if (address != null && age != 0) {
            return new Person(name, surname, age, address);
        } else if (address != null) {
            return new Person(name, surname, address);
        } else if (age != 0 ) {
            return new Person(name, surname, age);
        } else {
            return new Person(name, surname);
        }
    }
}
