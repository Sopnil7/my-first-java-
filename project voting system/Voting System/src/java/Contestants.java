/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.* ; 
import org.json.JSONObject; 

/**
 *
 * @author lenovo
 */
@WebServlet(urlPatterns = {"/Contestants"})
public class Contestants extends HttpServlet {

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
            String contestant = request.getParameter("name");
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/voting_system","veenayak","qwerty");  
            Statement stmt=con.createStatement();  
            String msg ="";           
            String query2 = "select * from rank";
            String msg2 ="";           
            String query3 = "select * from rank order by votes desc";
            ResultSet rs=stmt.executeQuery(query2);
            int flag = 0;
            JSONObject obj = new JSONObject();
            while(rs.next()){
                String name = rs.getString(1);
                if(name.equals(contestant)){
                    flag = 1;
                    obj.put("failed","true");
                    break;
                }
            }
            int i=0;
            if(flag==0){
                String query = "insert into rank(name,votes) values('"+contestant+"',0)";
                int ru=stmt.executeUpdate(query);     
                msg = msg+"<div><p>"+contestant+"</p><button>Vote</button></div> "; 
                obj.put("contestants",msg);
            }
            ResultSet rs2=stmt.executeQuery(query3);
            while(rs2.next()){
                i++;
                String name3 = rs2.getString(1);
                msg2 = msg2+"<li class='items'><span>"+i+"</span>&nbsp;&nbsp;"+rs2.getString(1)+"<span>"+rs2.getInt(2)+"</span></li>";
            }            
            obj.put("rank",msg2);
            out.println(obj);
        }
        catch(Exception e){ System.out.println(e);}  
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
