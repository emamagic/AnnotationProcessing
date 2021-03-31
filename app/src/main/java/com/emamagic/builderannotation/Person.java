package com.emamagic.builderannotation;

public class Person {

    private final String name;
    private final String family;
    private final int age;

    private Person(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public static class Builder {
        private String name;
        private String family;
        private int age;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFamily(String family) {
            this.family = family;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, family, age);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }
}


