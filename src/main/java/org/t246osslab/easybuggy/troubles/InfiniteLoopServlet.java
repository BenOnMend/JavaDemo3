package org.t246osslab.easybuggy.troubles;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/infiniteloop" })
public class InfiniteLoopServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(InfiniteLoopServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        while (true) {
            String contextPath = req.getContextPath();
            int contentLength = req.getContentLength();
            log.debug("contextPath: {}, contentLength: {}", contextPath, contentLength);
        }
    }
}
