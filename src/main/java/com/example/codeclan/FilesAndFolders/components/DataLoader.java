package com.example.codeclan.FilesAndFolders.components;

import com.example.codeclan.FilesAndFolders.models.File;
import com.example.codeclan.FilesAndFolders.models.Folder;
import com.example.codeclan.FilesAndFolders.models.Person;
import com.example.codeclan.FilesAndFolders.repositories.FileRepository;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepository;
import com.example.codeclan.FilesAndFolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //don't run during tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        Person lisa = new Person("Lisa");
        personRepository.save(lisa);

        Person fred = new Person("Fred");
        personRepository.save(fred);

        Person mohammed = new Person("Mohammed");
        personRepository.save(mohammed);

        Person elija = new Person("Elija");
        personRepository.save(elija);

        Person louise = new Person("louise");
        personRepository.save(louise);

        Folder project = new Folder("project", elija);
        folderRepository.save(project);

        Folder documents = new Folder("documents", elija);
        folderRepository.save(documents);

        Folder photos = new Folder("photos", fred);
        folderRepository.save(photos);

        Folder articles = new Folder("articles", mohammed);
        folderRepository.save(articles);

        Folder news = new Folder("news", louise);
        folderRepository.save(news);

        Folder archive = new Folder("archive", lisa);
        folderRepository.save(archive);

        File planning = new File("planning", ".word", .89, project);
        fileRepository.save(planning);

        File top_secret = new File ("top_secret", ".pdf", 1.6, archive);
        fileRepository.save(top_secret);

        File receipts_19 = new File("receipts_19", ".word", 7.67, archive);
        fileRepository.save(receipts_19);

        File to_do = new File("to_do", ".word", 0.56, documents);
        fileRepository.save(to_do);

        File summary = new File("summary", ".ppt", 5.32, documents);
        fileRepository.save(summary);

        File summer18 = new File("summer18", ".jpg", 2.1,photos);
        fileRepository.save(summer18);

        File profile_pic = new File("profile_pic", ".jpg", 4.2, photos);
        fileRepository.save(profile_pic);


    }





}
