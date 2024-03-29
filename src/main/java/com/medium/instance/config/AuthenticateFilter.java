package com.medium.instance.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.medium.instance.models.DTO.user.WebUserDTO;
import com.medium.instance.models.request.WebUserLoginRequest;
import com.medium.instance.services.WebUserService;
import com.medium.instance.services.WebUserServiceInterface;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class AuthenticateFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authManager;

    public AuthenticateFilter(AuthenticationManager authManager) {
        this.authManager = authManager;
    }


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            WebUserLoginRequest creds = new ObjectMapper().readValue(request.getInputStream(), WebUserLoginRequest.class);
            return this.authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            creds.getEmail(),
                            creds.getPassword(),
                            new ArrayList<>()
                    )
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        String userName = ((User) authResult.getPrincipal()).getUsername();
        String token = Jwts.builder().setSubject(userName)
                .setExpiration(new Date(System.currentTimeMillis() + WebSecurity.EXPIRE_TIME))
                .signWith(SignatureAlgorithm.HS512, WebSecurity.TOKEN_SECRET)
                .compact();

        WebUserServiceInterface webUser = BeanUtil.getBean(WebUserService.class);
        WebUserDTO webUserData = webUser.getUser(userName);

        response.addHeader(WebSecurity.HEADER_STRING, WebSecurity.TOKEN_PREFIX + token);
        response.addHeader("webUserId", webUserData.getId().toString());
    }
}
