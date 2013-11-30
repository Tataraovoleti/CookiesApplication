/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TATARAO
 */
public class SFCookie extends HttpServlet {

    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
       
        // get values submited by form
        
        String income=request.getParameter("income");
        String tax=request.getParameter("tax");
        
        out.println("Income tax details <br>");
        out.println("<body bgcolor=#ffffff>");
        out.println(income+"<br>"+tax+"<br>");
        
        Cookie ck[]=request.getCookies();
        for(int i=0;i<ck.length;i++)
        {
            out.println(ck[i].getName()+"  "+ck[i].getValue());
            out.println("<br>");
        }
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
       
    }
}
