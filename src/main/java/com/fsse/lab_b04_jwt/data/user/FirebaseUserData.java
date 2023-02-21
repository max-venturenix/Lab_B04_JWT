package com.fsse.lab_b04_jwt.data.user;

import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

public class FirebaseUserData {
    private String firebaseUid;
    private String email;
    private String issuer;

    public FirebaseUserData(JwtAuthenticationToken jwtToken) {
        this.firebaseUid = (String) jwtToken.getTokenAttributes().get("user_id");
        this.email = (String) jwtToken.getTokenAttributes().get("email");
        this.issuer = (String) jwtToken.getTokenAttributes().get("iss");
    }

    public String getFirebaseUid() {
        return firebaseUid;
    }

    public void setFirebaseUid(String firebaseUid) {
        this.firebaseUid = firebaseUid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
