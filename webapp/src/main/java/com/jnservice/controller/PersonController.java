package com.jnservice.controller;

import com.jnservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("test.do")
    public void test()
    {
        personService.queryPerson();
    }

    @RequestMapping("isLogin.do")
    public void isLogin(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws IOException {
        String auth=request.getParameter("auth");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        boolean result=personService.isLogin(auth,username,password);
        if(result)
        {
            try {
                String path=request.getContextPath()+"main/peradmin.jsp";
                request.getRequestDispatcher(path).forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
        response.sendRedirect(request.getContextPath()+"login/login.jsp");

    }
}
