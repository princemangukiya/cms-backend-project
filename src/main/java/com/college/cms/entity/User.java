package com.college.cms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Ye getters, setters, toString, etc. sab bana dega
@AllArgsConstructor // Parameterized constructor ke liye
@NoArgsConstructor  // Empty constructor (Hibernate ke liye zaroori hai)
@Entity
@Table(name = "user_detail")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "full_name")
    private String full_name;

    // React mein aap 'emailId' bhej rahe hain,
    // isliye variable ka naam 'emailId' hi rehne dein,
    // ye @Column annotation se database ke 'email_id' column se map ho jayega.
    @Column(name = "email_id")
    private String emailId;

    @Column(name = "mobile_no")
    private String mobile_no;

    @Column(name = "password")
    private String password;

    @Column(name = "role_id")
    private Long role_id;
}