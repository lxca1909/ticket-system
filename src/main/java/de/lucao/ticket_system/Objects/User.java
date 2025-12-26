package de.lucao.ticket_system.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, name = "userId")
    private Long userId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastname;
}
