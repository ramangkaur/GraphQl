package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;


//@Configuration
//@EnableWebFluxSecurity
//@EnableReactiveMethodSecurity
public class SecurityConfig {/*

	@Bean
	SecurityWebFilterChain springWebFilterChain(ServerHttpSecurity http) throws Exception {
		return http
				.csrf(spec -> spec.disable())
				// Demonstrate that method security works
				// Best practice to use both for defense in depth
				.authorizeExchange(requests -> requests.anyExchange().permitAll())
				.httpBasic(withDefaults())
				.build();
	}

	@Bean
	@SuppressWarnings("deprecation")
	public MapReactiveUserDetailsService userDetailsService() {
		User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
		UserDetails rob = userBuilder.username("rob").password("rob").roles("USER").build();
		UserDetails admin = userBuilder.username("admin").password("admin").roles("USER", "ADMIN").build();
		return new MapReactiveUserDetailsService(rob, admin);
	}

*/}
