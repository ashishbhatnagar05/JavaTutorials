package com.jpa.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @Column(name = "STUDENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "STUDENT_NAME")
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "flat_no", column = @Column(name = "FLAT_NO")),
            @AttributeOverride(name = "apartment", column = @Column(name = "APARTMENT")),
            @AttributeOverride(name = "city", column = @Column(name = "CITY"))
    })
    private Address address;


    @ElementCollection(targetClass = String.class, fetch = FetchType.LAZY)
    @JoinTable(name = "STUDENT_BOOK", joinColumns = @JoinColumn(name = "BOOK_ID"))
    private List<String> books;


    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name, Address address, List<String> books) {

        this.name = name;
        this.address = address;
        this.books = books;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

}
