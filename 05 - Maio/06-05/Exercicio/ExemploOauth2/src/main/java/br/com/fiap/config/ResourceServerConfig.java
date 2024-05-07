package br.com.fiap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class ResourceServerConfig {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Desabilitar CSRF para simplificar, reabilitar conforme necessário
                .authorizeRequests()
                .requestMatchers(new AntPathRequestMatcher("/user", "POST")).permitAll() // Allow POST requests to /user without authentication
                .antMatchers("/oauth/authorize**", "/login**", "/error**").permitAll()  // Permitir acesso não autenticado ao endpoint de autorização e login
                .antMatchers("/public").permitAll()  // Endpoint público acessível a todos
                .antMatchers("/private").authenticated()  // Endpoint privado acessível a usuários autenticados
                .antMatchers("/admin").hasAuthority("ROLE_ADMIN")  // Endpoint de administração acessível a usuários com ROLE_ADMIN
                .anyRequest().authenticated()
                .and()
                .httpBasic(withDefaults())
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}