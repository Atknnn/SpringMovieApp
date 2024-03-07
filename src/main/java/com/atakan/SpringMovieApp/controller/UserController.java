package com.atakan.SpringMovieApp.controller;

import com.atakan.SpringMovieApp.repository.entity.User;
import com.atakan.SpringMovieApp.dto.request.LoginRequestDto;
import com.atakan.SpringMovieApp.dto.request.UserRegisterRequestDto;
import com.atakan.SpringMovieApp.dto.response.LoginResponseDto;
import com.atakan.SpringMovieApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/save")
    public ResponseEntity<User> createUser(String name, String surname, String email, String passwprd){
         return ResponseEntity.ok(userService.createUser(name,surname,email,passwprd));
    }
    @GetMapping("register")
    public ResponseEntity<User> register(UserRegisterRequestDto dto){
        return ResponseEntity.ok(userService.register(dto));
    }
    @GetMapping("/findAllByOrderByName")
    public ResponseEntity<List<User>> findAllByOrderByName(){
        return ResponseEntity.ok(userService.findAllByOrderByName());
    }

    @GetMapping("findAllByNameContainingIgnoreCase")
    public ResponseEntity<List<User>> findAllByNameContainingIgnoreCase(String value){
        return ResponseEntity.ok(userService.findAllByNameContainingIgnoreCase(value));
    }
    @GetMapping("findAllByEmailContainingIgnoreCase")
    public ResponseEntity<List<User>> findAllByEmailContainingIgnoreCase(String value){
        return ResponseEntity.ok(userService.findAllByEmailContainingIgnoreCase(value));
    }
    @GetMapping("findAllByEmailEndingWith")
    public ResponseEntity<List<User>> findAllByEmailEndingWith(String value){
        return ResponseEntity.ok(userService.findAllByEmailEndingWith(value));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(LoginRequestDto dto){
        return ResponseEntity.ok(userService.login(dto));
    }

    @GetMapping("/passwordLongerThan")
    public ResponseEntity<List<User>> passwordLongerThan(int value){
        return ResponseEntity.ok(userService.passwordLongerThan(value));
    }
}
