package org.t246osslab.easybuggy.errors;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/oome" })
public class OutOfMemoryErrorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append("OutOfMemoryError!");
        }
    }
}
