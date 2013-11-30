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
public class SetCookies extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        
        String uname=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        
        Cookie ck1,ck2;
        ck1=new Cookie("uname",uname);
        ck2=new Cookie("pass",pwd);
        
        response.addCookie(ck1);
        response.addCookie(ck2);
        
        // we need to generate second form dynamically
        
        out.println("<html><head>");
        out.println("<title>Income Tax details form</title>");
        out.println("</head><body bgcolor=#ffffff>");
        out.println("<form action=SFCookie method=get>");
        out.println("Income for this year : <input type=text name=income><br>");
        out.println("Tax : <input type=text name=tax><br>");
        out.println("<input type=submit value=Submit>");
        out.println("</form></body></html>");
        out.close();
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

}
