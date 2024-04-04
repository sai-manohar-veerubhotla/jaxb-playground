package ca.fun.jaxbplayground;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Person")
public class Person {
    private String name;
    private int age;

    // Default constructor is required for JAXB
    public Person() {}

    // Getters and setters
    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "Age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
