package ca.fun.jaxbplayground;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Main {


    public static void main(String[] args) {
        try {
            Person person = new Person();
            person.setName("John Doe");
            person.setAge(30);

            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            // Pretty print
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Marshal the person object to System.out
            marshaller.marshal(person, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
