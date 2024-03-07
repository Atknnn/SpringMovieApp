package com.atakan.SpringMovieApp.repository.entity;

import com.atakan.SpringMovieApp.repository.enums.EUserType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Size(max = 50)
    private String name;
    @Size(max = 50)
    private String surname;
    @Size(max = 50)
    private String email;
    @Size(max = 15)
    private String phone;
    @Size(max = 32)
    private String password;
    @Builder.Default
    @Enumerated
    private EUserType userType=EUserType.USER;
    @ElementCollection
    private List<Long> favMovies;
    @ElementCollection
    private List<Long> favGenres;
    @ElementCollection
    private List<Long> comments;
}
