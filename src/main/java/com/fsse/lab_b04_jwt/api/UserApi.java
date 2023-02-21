package com.fsse.lab_b04_jwt.api;

import com.fsse.lab_b04_jwt.data.user.FirebaseUserData;
import com.fsse.lab_b04_jwt.util.JwtUtil;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserApi {
    @GetMapping("/me/details")
    public FirebaseUserData getMyUserDetails(JwtAuthenticationToken jwtToken) {
        FirebaseUserData loginUser = JwtUtil.getFirebaseUser(jwtToken);
        return loginUser;
    }
}

