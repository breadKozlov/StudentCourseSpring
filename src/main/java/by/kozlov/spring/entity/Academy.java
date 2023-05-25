package by.kozlov.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Academy {

    private String nameOfAcademy;
    private List<Course> courseList;
    private Set<Trainer> trainers;
    private Map<String,Trainer> courseTrainer;
    private Map<String,String> namesOfStudents;

    public void init() {
        System.out.println("Init Academy");
    }

    public void destroy() {
        System.out.println("Destroy Academy");
    }
}
