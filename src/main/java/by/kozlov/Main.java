package by.kozlov;

import by.kozlov.spring.entity.Course;
import by.kozlov.spring.entity.Student;
import by.kozlov.spring.entity.Trainer;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("application.xml")){

            var student1 = context.getBean("student1",Student.class);
            var student2 = context.getBean("student2",Student.class);
            var course1 = (Course) student1.getCourse();
            var course2 = (Course) student2.getCourse();
            System.out.println(course1.getNameOfCourse() + " - " + course1.getDescription() + " - "
                    + course1.getCost() + "$");
            System.out.println(course2.getNameOfCourse() + " - " + course2.getDescription() + " - "
                    + course2.getCost() + "$");
            var trainer = context.getBean(Trainer.class);
            System.out.println("Trainer name is: " + trainer.getName());
        }
    }
}