package by.kozlov.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SalaryTrainer {
    private Trainer trainer;
    private Integer rank;
    private Double payPerHour;
    private Double prize;
    private Double hours;

    public Double getSumSalary() {
        return (double) Math.round((payPerHour * hours) * prize * rank + (payPerHour * hours));
    }

    public void init() {
        System.out.println("Init Course");
    }

    public void destroy() {
        System.out.println("Destroy Course");
    }


}
