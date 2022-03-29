package id.ac.uin.student.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "First name is required")
    @NotNull(message = "First name cannot be null")
    @Column(nullable = false, name = "first_Name")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @NotNull(message = "Last name cannot be null")
    @Column(nullable = false, name = "last_name")
    private String lastName;

    @NotEmpty(message = "email is required")
    @Email
    @Column(nullable = false, name = "email", unique = true)
    private String email;

    @NotEmpty(message = "Phone number is required")
    @NotNull(message = "Phone number cannot be null")
    @Size(min = 10, max = 14, message = "Phone number should be of minimum 10 digits")
    @Column(nullable = false, unique = true)
    private String phone;

    @NotEmpty(message = "jurusan is required")
    @NotNull(message = "Jurusan cannot be null")
    @Column(nullable = false, unique = true)
    private String jurusan;
}