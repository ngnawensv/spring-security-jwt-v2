package cm.belrose.springsecurityjwtv2.model.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AuthenticateResponse {

    @Getter
    private String jwt;
}
