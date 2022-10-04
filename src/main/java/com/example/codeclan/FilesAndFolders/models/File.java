package com.example.codeclan.FilesAndFolders.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="fileName")
    private String fileName;

    @Column(name="extension")
    private String extension;

    @Column(name="sizeInMb")
    private double sizeInMb;

    @ManyToOne
    @JoinColumn(name="folder_id", nullable=false)
    @JsonIgnoreProperties({"files"})
    private Folder folder;

    public File(String fileName, String extension, Double sizeInMb, Folder folder){
        this.fileName=fileName;
        this.extension=extension;
        this.sizeInMb=sizeInMb;
        this.folder=folder;
    }

    public File(){
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public double getSizeInMb() {
        return sizeInMb;
    }

    public void setSizeInMb(double sizeInMb) {
        this.sizeInMb = sizeInMb;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
