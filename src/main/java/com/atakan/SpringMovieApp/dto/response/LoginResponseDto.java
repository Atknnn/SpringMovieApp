package com.atakan.SpringMovieApp.dto.response;

import com.atakan.SpringMovieApp.repository.enums.EUserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponseDto {
    private String name;

    private String surname;

    private String email;

    private String phone;

    private String password;

    private EUserType userType;

    private List<Long> favMovie;

    private List<Long> favGenre;

    private List<Long> comments;
}
