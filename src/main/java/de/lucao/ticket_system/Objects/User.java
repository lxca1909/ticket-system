package de.lucao.ticket_system.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, name = "userId")
    private Long userId;

    @Column(name = "vorname")
    private String vorname;

    @Column(name = "nachname")
    private String nachname;
}
