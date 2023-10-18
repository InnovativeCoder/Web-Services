package dev.jerry.restful.Security;

import com.sun.net.httpserver.HttpsServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfigutation {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        //all requests should be authenticated
        http.authorizeHttpRequests(
                auth-> auth.anyRequest().authenticated()
        );
        // if a reuqest is not authenticated, a web page is shown
        http.httpBasic(Customizer.withDefaults());

        // for post, put requests, csrf is disbaled 
        http.csrf().disable();

        return http.build();
    }
}
