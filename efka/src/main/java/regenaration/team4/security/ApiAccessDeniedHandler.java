package regenaration.team4.security;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class ApiAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.getOutputStream().print("Access denied");
        httpServletResponse.setStatus(HttpServletResponse.SC_FORBIDDEN); // 403
        httpServletResponse.sendRedirect("error403.html"); //se auti tin selida html tha mas kateuthinei otan exoume access denied

    }
}