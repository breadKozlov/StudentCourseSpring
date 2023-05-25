package by.kozlov.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trainer implements InitializingBean, DisposableBean, Comparable<Trainer> {

    private String name;

    private final static Trainer INSTANCE = new Trainer("name");

    public static Trainer getInstance(String name) {
        INSTANCE.setName(name);
        return INSTANCE;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am the init method in the object Trainer");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I am the destroy method in the object Trainer");
    }

    @Override
    public int compareTo(Trainer o) {
        return this.name.compareTo(o.getName());
    }
}
