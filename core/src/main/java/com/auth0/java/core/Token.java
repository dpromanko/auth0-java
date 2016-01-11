package com.auth0.java.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class that holds a user's token information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Token {

    protected String idToken;
    protected String accessToken;
    protected String type;
    protected String refreshToken;

    protected Token(Token token) {
        idToken = token.idToken;
        accessToken = token.accessToken;
        type = token.type;
        refreshToken = token.refreshToken;
    }

    protected Token() {

    }

    public Token(@JsonProperty(value = "id_token", required = true) String idToken,
                 @JsonProperty(value = "access_token") String accessToken,
                 @JsonProperty(value = "token_type") String type,
                 @JsonProperty(value = "refresh_token") String refreshToken) {
        this.idToken = idToken;
        this.accessToken = accessToken;
        this.type = type;
        this.refreshToken = refreshToken;
    }

    public String getIdToken() {
        return idToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getType() {
        return type;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
}
