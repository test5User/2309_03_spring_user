package by.itclass.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "new_user")
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fio")
    @NonNull private String name;
    @NonNull private int age;
    @OneToOne
    private Address address;

    public User(int id, @NonNull String name, @NonNull int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
