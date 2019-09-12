package com.spring.boot.security.ex;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

/**
 * Created by sarangic on 12/09/19.
 */

/*
   If we do not have  this configuration, every api is secured as we have added spring-boot-starter-security in pom.
   If we want to configure out own security constraints, we can extend WebSecurityConfigurerAdapter and add our own security contraints.

   Example below, "index.html" and "/" is allowed without  basic authentication. So index.html page is launched directly.
   But when invoke "/greeting" API  it needs basic auth.
   In java script, we are using ajax to invoke rest call, and passing basic auth in the header.
   If we dont pass authorization header, as soon as we click button, we get pop up asking for username/password.

   But /greeting API needs Authentication.

 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/index.html", "/").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                .logout().logoutSuccessUrl("/");
    }

}
