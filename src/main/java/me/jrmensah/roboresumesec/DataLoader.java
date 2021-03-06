package me.jrmensah.roboresumesec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements CommandLineRunner {


    ResumeRepository resumeRepository;

    @Override
    public void run(String...strings) throws Exception{
        System.out.println("Loading data...");


       Resume resume = new Resume("John"," J","Jingleheimer-Schmidt","jjjschmidt@gmail.com","BS","Psychology","UMaryland","2002","PHP","Amtrak", "Developer", "duty1","duty2", "highly skilled");
       resumeRepository.save(resume);

       resume = new Resume("Jane","B","Doe","jbdoe@gmail.com","MS", "Software Engineering", "Johns Hopkins U","2005","Ruby on Rails","DCPS","Business Analyst","duty1","duty2", "proficient" );
       resumeRepository.save(resume);




    }



}
