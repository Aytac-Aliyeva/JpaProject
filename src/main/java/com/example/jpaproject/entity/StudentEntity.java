package com.example.jpaproject.entity;
import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Telebeninadi", length = 50, nullable = false, unique = false)

    private String name;
    @Column(name = "Telebeninsoyadi", length = 50, nullable = false, unique = false)

    private String surname;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
