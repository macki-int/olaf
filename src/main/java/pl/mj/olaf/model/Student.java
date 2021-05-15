package pl.mj.olaf.model;

import java.time.LocalDate;
import java.util.UUID;

public class Student {
    private UUID id;
    private String firstName;
    private String lastName;
    private String eMail;
    private LocalDate dayOfBirth;

    public Student(UUID id, String firstName, String lastName, String eMail, LocalDate dayOfBirth) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.dayOfBirth = dayOfBirth;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
