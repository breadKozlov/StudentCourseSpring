package by.kozlov.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course implements ICourse{

    private Integer id;
    private String nameOfCourse;
    private String description;
    private Double cost;

    public void init() {
        System.out.println("Init Course");
    }

    public void destroy() {
        System.out.println("Destroy Course");
    }


}
