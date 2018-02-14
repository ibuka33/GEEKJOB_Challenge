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
@WebServlet(name = "blackjack", urlPatterns = {"/blackjack1"})
public class blackjack1 extends HttpServlet {

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
            //Dealerのインスタンス
            Dealer dealer = new Dealer();
            //Userのインスタンス
            User user = new User();

            dealer.deal();
            dealer.setCard(dealer.deal());
            user.setCard(dealer.deal());

            dealer.checkSum();
            user.checkSum();

            if (dealer.checkSum() == true) {
                for (int i = 1; i <= 17; i++) {
                    dealer.hit();
                }

            }
            if (user.checkSum() == true) {
                for (int i = 1; i <= 21; i++) {
                    dealer.hit();
                }

                dealer.open();
                user.open();

                if (dealer.open() == user.open() || dealer.open() >= 22 && user.open() >= 22 || dealer.open() == 21 && user.open() == 21) {
                    out.println("引き分けです<br>");
                } else if (user.open() == 21) {
                    out.println("ユーザーがブラックジャックです<br>");
                } else if (dealer.open() == 21) {
                    out.println("ディーラーがブラックジャックです<br>");
                } else if (dealer.open() > user.open()) {
                    out.print("ディーラーの勝ちです<br>");
                } else if (dealer.open() < user.open()) {
                    out.print("ユーザーの勝ちです<br>");
                } else if (dealer.open() == user.open()) {
                    out.print("引き分けです<br>");
                }
                 
            }

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
