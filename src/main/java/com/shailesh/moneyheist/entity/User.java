package com.shailesh.moneyheist.entity;

import com.shailesh.moneyheist.common.UserPasswordEncoder;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"version", "password"})
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Version
    @Column(name = "version")
    private Integer version;

    @Column(name = "email_id",nullable = false, unique = true)
    private String email;
    @Column(name = "phone_no", length = 10)
    private String phone;

    @Column(name = "password_salt", nullable = false)
    private String password;

    @Column(name = "created_at", updatable = false)
    private Long createdAt;

    @Column(name = "updated_at")
    private Long updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = System.currentTimeMillis();
        updatedAt = System.currentTimeMillis();
        password = UserPasswordEncoder.encodePassword(password);
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = System.currentTimeMillis();
    }

}
