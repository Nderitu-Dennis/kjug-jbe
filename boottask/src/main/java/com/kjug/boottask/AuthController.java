package com.kjug.boottask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.kjug.boottask.Resources.UserResource;
import static com.kjug.boottask.Resources.RegistrationResource;
import static com.kjug.boottask.Resources.SessionResource;
import static com.kjug.boottask.Resources.LoginResource;
@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private AuthService authService;
    @PostMapping("/register")
    public ResponseEntity<UserResource> registerUser(
            @RequestBody RegistrationResource registrationDetails
    ){
        var resource = authService.registerUser(registrationDetails);
        return new ResponseEntity<>(resource, HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<SessionResource> login(
            @RequestBody LoginResource credentials
            ){


        return null;
    }
}
