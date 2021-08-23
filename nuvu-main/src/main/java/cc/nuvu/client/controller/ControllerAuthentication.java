package cc.nuvu.client.controller;

import cc.nuvu.client.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Slf4j
@RestController
public class ControllerAuthentication {

    @PostMapping(Constant.MAPPING_AUTHENTICATION_APP)
    public Map<String, String> login(@RequestParam String user) {

        Map<String, String> credentials = new HashMap<>();
        credentials.put("Token", getJWTToken(user));
        return credentials;
    }

    private String getJWTToken(String username) {

        String secretKey = Constant.SECRET_KEY;
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList(Constant.AUTHORITY);

        String token = Jwts
                .builder()
                .setId(Constant.ID_TOKEN)
                .setSubject(username)
                .claim(Constant.CLAIM_NAME,
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + Constant.EXPIRATION))
                .signWith(SignatureAlgorithm.HS512,secretKey.getBytes()).compact();

        return Constant.PREFIX + token;
    }
}
