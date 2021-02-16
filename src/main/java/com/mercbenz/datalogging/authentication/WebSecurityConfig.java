package com.mercbenz.datalogging.authentication;
//package com.mercbenz.authentication;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import com.microsoft.azure.spring.autoconfigure.aad.AADAuthenticationFilter;
//
///*
// * This class is used to set authentication.
// * Each time login is required when user want to access into the application.
// * Annotation Type "EnableGlobalMethodSecurity" Enables Spring Security global method security
// */ 
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//	
//	 @Autowired
//	  private AADAuthenticationFilter aadAuthFilter;
//	 
//	 private static final Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);
//	 @Override
//	  protected void configure(HttpSecurity http) throws Exception {
//
//	    http.cors().and().csrf().disable();
//
//	    http.csrf().ignoringAntMatchers("/**").and().authorizeRequests().anyRequest().permitAll();
//
//	    http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/")
//	        .deleteCookies("JSESSIONID").invalidateHttpSession(true);
//
//	    http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//
//	    http.addFilterBefore(aadAuthFilter, UsernamePasswordAuthenticationFilter.class);
//	    logger.info("Environment " ,aadAuthFilter.getEnvironment());
//	   
//	    
//	  }
//	 
//	 
//
//}
