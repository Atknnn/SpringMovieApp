package com.atakan.SpringMovieApp.mapper;

import com.atakan.SpringMovieApp.dto.response.LoginResponseDto;
import com.atakan.SpringMovieApp.repository.entity.User;
import com.atakan.SpringMovieApp.dto.request.UserRegisterRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);

    User fromRegisterRequestToUser(final UserRegisterRequestDto dto);
    LoginResponseDto fromUserToLoginResponseDto(final User user);
}
