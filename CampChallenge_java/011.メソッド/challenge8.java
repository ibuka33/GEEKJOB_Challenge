/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ibuka kentaro
 */
@WebServlet(name = "challenge8", urlPatterns = {"/challenge8"})
public class challenge8 extends HttpServlet {

    String[][] main() {

        String[][] prof;
        prof = new String[3][4];

        prof[0][0] = "1234";
        prof[0][1] = "井深";
        prof[0][2] = "3月3日";
        prof[0][3] = "板橋区";

        prof[1][0] = "5678";
        prof[1][1] = "田中";
        prof[1][2] = "2月2日";
        prof[1][3] = "練馬区";

        prof[2][0] = "9876";
        prof[2][1] = "佐藤";
        prof[2][2] = "1月1日";
        prof[2][3] = null;

        return prof;
    }

//        ar1.add(0, "２");
//        ar1.add(1, "４");
//        ar1.add(2, "６");
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge8</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge8 at " + request.getContextPath() + "</h1>");

            String[][] main = main();

            // for (String[] main1 : main) {
            //  for (int i = 0; i < main1.length; i++) {
            for (int j = 0; j < main.length; j++) {

                String[] main1 = main[j];
                int limit = 2;
                if (j==limit) {
                    break;
                }
                for (int i = 1; i < main1.length; i++) {

                    if (main1[i].equals(null)) {
                        continue;
                    }

                    out.println(main1[i]);

                }
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
