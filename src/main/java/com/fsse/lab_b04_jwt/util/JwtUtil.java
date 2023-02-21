package com.fsse.lab_b04_jwt.util;

import com.fsse.lab_b04_jwt.data.FirebaseUserData;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

public class JwtUtil {
    public static FirebaseUserData getFirebaseUser(JwtAuthenticationToken jwtToken) {
        return new FirebaseUserData(jwtToken);
    }
}
