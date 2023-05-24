package org.example.builder;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    public Person(String name,String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(String name,String surname, String address){
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name,String surname, int age, String address){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public IPersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(1)
                .setAddress(this.address);
    }

    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }
    public boolean hasAge() {
        OptionalInt age = getAge();
        return age.isPresent() && age.getAsInt() > 0;
    }
    public void happyBirthday() {
        if (hasAge()) {
            this.age += 1;
        }
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean hasAddress() {
        return this.address != null;
    }


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                (hasAge() ? ", age='" + age + '\'': "") +
                (hasAddress() ? ", address='" + address + '\'' : "") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(age, person.age) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
