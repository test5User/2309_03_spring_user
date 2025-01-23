package by.itclass.config;

import by.itclass.model.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

public class HibernateConfig {
    @Bean
    public Configuration configuration() {
        var cfg = new Configuration();
        cfg.addAnnotatedClass(User.class);
        return cfg;
    }

    @Bean
    public SessionFactory factory(Configuration configuration){
        return configuration.buildSessionFactory();
    }
}
