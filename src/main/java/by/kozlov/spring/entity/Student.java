package by.kozlov.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer id;
    private Integer age;
    private String name;
    private String surname;
    private ICourse course;

    public void init() {
        System.out.println("Init Student");
    }

    public void destroy() {
        System.out.println("Destroy Student");
    }
}
