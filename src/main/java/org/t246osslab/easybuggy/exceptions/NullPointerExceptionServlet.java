package org.t246osslab.easybuggy.exceptions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/npe" })
public class NullPointerExceptionServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String s = null;
        s.trim();
    }
}
