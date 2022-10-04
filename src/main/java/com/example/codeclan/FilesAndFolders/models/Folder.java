package com.example.codeclan.FilesAndFolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;

    @ManyToOne
    @JoinColumn(name="person_id", nullable=false)
    @JsonIgnoreProperties({"folders"})
    private Person person;

    @OneToMany(mappedBy="folder")
    @JsonIgnoreProperties({"folder"})
    private List<File> files;

    public Folder(String title, Person person){
        this.title=title;
        this.person=person;
        this.files=files;
    }

    public Folder(){
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
