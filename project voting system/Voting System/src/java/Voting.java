/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = {"/Voting"})
public class Voting extends HttpServlet {

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
            String name = request.getParameter("username");
            String contestant2 = contestant.replaceAll("\\s+","");
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/voting_system","veenayak","qwerty");  
            Statement stmt=con.createStatement();  
            JSONObject obj = new JSONObject();
            int votes= 0;
            String msg1 ="";   
            String msg2 ="";   
            String query = "select * from rank Order By votes desc";
            ResultSet rs=stmt.executeQuery(query);  
            while(rs.next()){
                if(contestant2.equals(rs.getString(1))){
                    votes = rs.getInt(2);
                    votes++;
                    break;
                }
            }      
            String query2 = "update rank set votes="+votes+" where name='"+contestant2+"'";
            String query5 = "select * from voters";
            ResultSet rs3=stmt.executeQuery(query5);  
            int flag =0;
            while(rs3.next()){         
                if(name.equals(rs3.getString(1))){
                    flag=1;
                    break;
                }                
            }
            if(flag==0){
                int up =stmt.executeUpdate(query2);
                String query4 = "insert into voters(name,contestant) values('"+name+"','"+contestant2+"')";
                int up2 =stmt.executeUpdate(query4);
                ResultSet rs2=stmt.executeQuery(query);
                int i=0;
                while(rs2.next()){
                        i++;                          
                        msg1 = msg1+"<li class='items'><span>"+i+"</span>&nbsp;&nbsp;"+rs2.getString(1)+"<span>"+rs2.getInt(2)+"</span></li>";
                }
                msg2 = "You voted for "+contestant2;
                obj.put("msg1",msg1);
                obj.put("msg2",msg2);            
            }
            else{
                obj.put("msg",10);
            }
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
