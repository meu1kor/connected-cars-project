package com.mercbenz.datalogging.authentication;
//package com.mercbenz.authentication;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.commons.lang3.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
//import org.springframework.stereotype.Component;
//import com.microsoft.azure.spring.autoconfigure.aad.UserPrincipal;
//
//@Component
//public class AuthenticationFilter implements Filter {
//
//	private static final Logger logger = LoggerFactory.getLogger(AuthenticationFilter.class);
//
//	@Override
//	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
//			throws IOException, ServletException {
//
//		boolean isValidUser = true;
//
//		HttpServletRequest request = (HttpServletRequest) req;
//		HttpServletResponse response = (HttpServletResponse) res;
//
//		String userName = StringUtils.EMPTY;
//		if (request.getUserPrincipal() != null) {
//			PreAuthenticatedAuthenticationToken authToken = (PreAuthenticatedAuthenticationToken) request
//					.getUserPrincipal();
//			if (authToken != null) {
//				final UserPrincipal principal = (UserPrincipal) authToken.getPrincipal();
//				if (principal != null) {
//					userName = principal.getUniqueName();
//				}
//			}
//			logger.info("userName : {}", userName);
//		}
//
//		if (StringUtils.isNotBlank(userName)) {
//			logger.debug("User Name = {}", userName);
//			isValidUser = true;
//		}
//
//		if (isValidUser) {
//			filterChain.doFilter(req, res);
//		} else {
//			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid User");
//			logger.info("Invalid user : {} tried to login....",userName);
//		}
//	}
//
//
//
//}
