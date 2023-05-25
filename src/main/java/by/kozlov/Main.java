package by.kozlov;

import by.kozlov.spring.entity.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("application.xml")){

            var student1 = context.getBean("student1",Student.class);
            var student2 = context.getBean("student2",Student.class);
            var course1 = (Course) student1.getCourse();
            var course2 = (Course) student2.getCourse();
            System.out.println("-----------");
            System.out.println(course1.getNameOfCourse() + " - " + course1.getDescription() + " - "
                    + course1.getCost() + "$");
            System.out.println(course2.getNameOfCourse() + " - " + course2.getDescription() + " - "
                    + course2.getCost() + "$");
            System.out.println("-----------");
            var trainer1 = context.getBean("trainer1",Trainer.class);
            var trainer2 = context.getBean("trainer2",Trainer.class);
            System.out.println("Trainer name is: " + trainer1.getName());
            System.out.println("Trainer name is: " + trainer2.getName());
            System.out.println("--------------");
            var academy = context.getBean(Academy.class);
            System.out.println(academy.getNameOfAcademy() + "courses:");
            academy.getCourseList().forEach(it -> System.out.println("- " + it.getNameOfCourse()
            + ", " + it.getDescription() + ", cost: " + it.getCost()));
            System.out.println("--------------");
            System.out.println(academy.getNameOfAcademy() + " students:");
            academy.getNamesOfStudents().forEach((key, value) -> System.out.println(key + " - " + value));
            System.out.println("------------");
            System.out.println(academy.getNameOfAcademy() + " trainers:");
            academy.getTrainers().forEach(it -> System.out.println("- " + it.getName()));
            System.out.println("-------------");
            System.out.println(academy.getNameOfAcademy() + " trainers-courses:");
            academy.getCourseTrainer().forEach((key,value) -> System.out.println(key + " - " + value.getName()));
            System.out.println("------------");
            var trainer3 = context.getBean("trainer3",Trainer.class);
            System.out.println(trainer3.getName());
            System.out.println("-------------");
            var salary = context.getBean(SalaryTrainer.class);
            System.out.println("Salary of " + salary.getTrainer().getName() + " is " + salary.getSumSalary());
            System.out.println("-------------");
        }
    }
}