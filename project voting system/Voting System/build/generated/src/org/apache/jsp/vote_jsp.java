package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class vote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Voting page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            *{\n");
      out.write("                font-family: monospace,sans-serif;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background: #311414;\n");
      out.write("            }\n");
      out.write("            nav{\n");
      out.write("                background: white;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                float: left;\n");
      out.write("                width: 100%;\n");
      out.write("                box-shadow: 0px 0px 10px black;\n");
      out.write("                position: sticky;\n");
      out.write("                top: 0px;\n");
      out.write("            }\n");
      out.write("            nav h1{\n");
      out.write("                margin: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            nav div{\n");
      out.write("                width: 50%;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            nav div:first-child{\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            nav div a{\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                float: right;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-family: fantasy,sans-serif;\n");
      out.write("            }              \n");
      out.write("            .active{\n");
      out.write("                background: #bc3939;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .head{\n");
      out.write("                position: relative;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("            }\n");
      out.write("            .head span{\n");
      out.write("                left: -100px;\n");
      out.write("                position: absolute;\n");
      out.write("            }\n");
      out.write("            .main{\n");
      out.write("                float: left;\n");
      out.write("                background: #642020;\n");
      out.write("                margin: 40px;\n");
      out.write("                padding: 0px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                margin-left: 2%;\n");
      out.write("                margin-right: 2%;\n");
      out.write("            }\n");
      out.write("            .main:nth-child(1){\n");
      out.write("                width: 22%;\n");
      out.write("                padding-bottom: 42px;\n");
      out.write("            }\n");
      out.write("            .main:nth-child(2){\n");
      out.write("                width: 72%;\n");
      out.write("                margin-left: 0%;\n");
      out.write("                float: right;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .items{\n");
      out.write("                background: #291d1d;\n");
      out.write("                padding: 15px;    \n");
      out.write("                text-transform: capitalize;\n");
      out.write("                list-style-type: none;\n");
      out.write("            }   \n");
      out.write("            .items span{\n");
      out.write("                float: right;\n");
      out.write("                background: #544646;\n");
      out.write("                padding: 0px 10px;\n");
      out.write("            }\n");
      out.write("            .items span:first-child{\n");
      out.write("                float: left\n");
      out.write("            }\n");
      out.write("            .main h3{\n");
      out.write("                margin-top: 0px;\n");
      out.write("                color: white;\n");
      out.write("                margin: 0;                \n");
      out.write("                padding: 10px 10px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("            }\n");
      out.write("            .main ol{\n");
      out.write("                padding-left: 0px;\n");
      out.write("                background: #291d1d;\n");
      out.write("                color: white;\n");
      out.write("                overflow: scroll;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                max-height: 67.5vh;\n");
      out.write("                margin: 0px;\n");
      out.write("            }\n");
      out.write("            .main ol::-webkit-scrollbar{\n");
      out.write("                width: 2px;\n");
      out.write("                background: transparent;\n");
      out.write("            }\n");
      out.write("            .main ol::-webkit-scrollbar-thumb{\n");
      out.write("                border-radius: 10px;\n");
      out.write("                background: black;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .main ol::-webkit-scrollbar-track{\n");
      out.write("                width: 5px;\n");
      out.write("                background: transparent;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .main:nth-child(2) h3{\n");
      out.write("                width: 50%;\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            .main p{\n");
      out.write("                width: 50%;\n");
      out.write("                float: left;\n");
      out.write("                margin: 0px;\n");
      out.write("                color: white;\n");
      out.write("                text-align: left;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("                padding: 5px 0px;\n");
      out.write("            }\n");
      out.write("            .main p:nth-child(2){\n");
      out.write("                text-align: right;\n");
      out.write("                padding: 11.5px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .maind{                 \n");
      out.write("                float: left;\n");
      out.write("                padding: 0px 10px 10px 10px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .maind button{\n");
      out.write("                padding: 7px 10px;\n");
      out.write("                border: none;\n");
      out.write("                background: #bc3939;\n");
      out.write("                color: white;\n");
      out.write("                float: right;\n");
      out.write("                outline: none!important;\n");
      out.write("            }\n");
      out.write("            .maind button:focus{\n");
      out.write("                box-shadow: inset 0px 0px 5px #151212;\n");
      out.write("            }\n");
      out.write("            .maind div{                 \n");
      out.write("                float: left;\n");
      out.write("                padding: 10px 10px;\n");
      out.write("                width: 33.33%;\n");
      out.write("                text-align: center;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("            }\n");
      out.write("            #modal1{\n");
      out.write("                height: 100%;\n");
      out.write("                display: none;\n");
      out.write("                top: 0;\n");
      out.write("                width: 100%;                \n");
      out.write("                left: 0;\n");
      out.write("                position: absolute;\n");
      out.write("                background: rgb(0,0,0,0.7);               \n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                background: white;\n");
      out.write("                box-shadow: 0px 5px 5px 10px black; \n");
      out.write("            }\n");
      out.write("            #modal1>div{\n");
      out.write("                position: relative;\n");
      out.write("                clear: both;\n");
      out.write("                margin: 0px;\n");
      out.write("                display: inline-block;\n");
      out.write("                text-align: center;\n");
      out.write("                left: 50%;\n");
      out.write("                top: 150px;\n");
      out.write("                width: 400px;\n");
      out.write("                padding: 10px;\n");
      out.write("                box-shadow: 0px 10px 10px #1c0d0d;\n");
      out.write("                background: #971e1e;\n");
      out.write("                transform: translatex(-50%);\n");
      out.write("            }\n");
      out.write("            fieldset div{\n");
      out.write("                width: 90%;\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                margin-left: 5%;\n");
      out.write("                margin-right: 5%;\n");
      out.write("            }\n");
      out.write("            #modal1 fieldset{\n");
      out.write("                border: none;\n");
      out.write("                padding: 0px 20px 40px 20px;\n");
      out.write("                background: #ae2e2e;\n");
      out.write("                box-shadow: inset 0px 0px 150px #8b1b1b;\n");
      out.write("            }\n");
      out.write("            #modal1 label{\n");
      out.write("                float: left;\n");
      out.write("                background: #322c2c;\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 20%;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            #modal1 legend{\n");
      out.write("                color: white;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            #modal1 button{\n");
      out.write("                width: 50%;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                background: #322c2c!important;\n");
      out.write("                color: white;\n");
      out.write("                float: right;\n");
      out.write("                outline: none!important;\n");
      out.write("                border: 0px;\n");
      out.write("                padding: 10.5px;\n");
      out.write("                font-family: monospace,sans-serif;\n");
      out.write("                margin-top: 15px;\n");
      out.write("            }\n");
      out.write("            #modal1 input{\n");
      out.write("                outline: none!important;\n");
      out.write("                border: 0px;\n");
      out.write("                float: left;\n");
      out.write("                padding: 10.5px;\n");
      out.write("                color: white;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-family: monospace;\n");
      out.write("                background: #4b3939!important;\n");
      out.write("                width: 80%;\n");
      out.write("            }\n");
      out.write("            .close{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 10px;\n");
      out.write("                right: 15px;           \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"nav a\").click(function () {\n");
      out.write("                    $(\"nav a\").removeClass(\"active\");\n");
      out.write("                    $(this).addClass(\"active\");\n");
      out.write("                });\n");
      out.write("                $(\"nav a:eq(1)\").click(function () {\n");
      out.write("                    $(\"#signup\").hide();\n");
      out.write("                    $(\"#login\").show();\n");
      out.write("                });\n");
      out.write("                $(\"nav a:eq(0)\").click(function () {\n");
      out.write("                    $(\"#login\").hide();\n");
      out.write("                    $(\"#signup\").show();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            i = 0;\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var len = $(\".head span\").length;\n");
      out.write("                i = len;\n");
      out.write("                var interval = setInterval(function () {\n");
      out.write("                    $(\".head span:eq(\" + i + \")\").animate({left: 10 + 20 * i});\n");
      out.write("                    i--;\n");
      out.write("                    if (i < 0) {\n");
      out.write("                        clearInterval(interval);\n");
      out.write("                    }\n");
      out.write("                    console.log(i);\n");
      out.write("                }, 150);\n");
      out.write("            });\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".maind button\").click(function () {\n");
      out.write("                    var name = $(this).parent().children(\"p\").text();\n");
      out.write("                    ");
 String username2 =request.getAttribute("user").toString();out.println("var username="+"'"+username2+"'");
      out.write(";\n");
      out.write("                            ");
 String username3 =request.getAttribute("ad").toString();out.println("var user="+"'"+username3+"'");
      out.write(";\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: \"GET\",\n");
      out.write("                        url: \"Voting\",\n");
      out.write("                        data: \"name=\" + name+\"&username=\"+username,\n");
      out.write("                        success: function (msg) {\n");
      out.write("                            if(msg ==10){ \n");
      out.write("                                alert(\"You have already voted!!\");\n");
      out.write("                            }\n");
      out.write("                            else if(user ==\"admin\"){\n");
      out.write("                                $(\".main:first-child ol\").html(msg); \n");
      out.write("                                alert(\"Success!!\");\n");
      out.write("                            }\n");
      out.write("                            else{\n");
      out.write("                                alert(\"success!!\");\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function () {\n");
      out.write("                            alert(\"failed\");\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });                            \n");
      out.write("            });\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#contestants\").click(function () {\n");
      out.write("                    $(\"#modal1\").show();\n");
      out.write("                });\n");
      out.write("                $(\"#modal1 .close\").click(function () {\n");
      out.write("                    $(\"#modal1\").hide();\n");
      out.write("                });\n");
      out.write("                $(\"#submit\").click(function () {\n");
      out.write("                    if($(\"#name\").val()!=\"\"){\n");
      out.write("                        var name =$(\"#name\").val();\n");
      out.write("                        console.log(name);\n");
      out.write("                        $.ajax({\n");
      out.write("                            type: \"GET\",\n");
      out.write("                            url: \"Contestants\",\n");
      out.write("                            data: \"name=\"+name,\n");
      out.write("                            success: function (msg) {\n");
      out.write("                                var obj = JSON.parse(msg);\n");
      out.write("                                if(obj.failed==\"true\"){\n");
      out.write("                                    alert(\"Username already exists!!\");\n");
      out.write("                                }\n");
      out.write("                                else{\n");
      out.write("                                    var msg1 = obj.rank;\n");
      out.write("                                    var msg2 = obj.contestants;\n");
      out.write("                                    $(\".maind\").append(msg2);\n");
      out.write("                                    $(\".main:first-child ol\").html(msg1);\n");
      out.write("                                    $(\"#modal1\").hide();\n");
      out.write("                                }\n");
      out.write("                            },\n");
      out.write("                            error: function () {\n");
      out.write("                                alert(\"failed\");\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });                            \n");
      out.write("            });\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                var i=0;\n");
      out.write("                var len = $(\".items\").length;\n");
      out.write("                for(i=0;i<len;i++){\n");
      out.write("                    $(\".items:eq(\"+i+\")\").prepend(\"<span>\"+parseInt(i+1)+\"</span>\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px;\">\n");
      out.write("        <nav>\n");
      out.write("            <div>\n");
      out.write("                <h1 class= \"head\">\n");
      out.write("                    <span>v</span>\n");
      out.write("                    <span>o</span>\n");
      out.write("                    <span>t</span>\n");
      out.write("                    <span>i</span>\n");
      out.write("                    <span>n</span>\n");
      out.write("                    <span>g</span>\n");
      out.write("                    <span> </span>\n");
      out.write("                    <span>s</span>\n");
      out.write("                    <span>y</span>\n");
      out.write("                    <span>s</span>\n");
      out.write("                    <span>t</span>\n");
      out.write("                    <span>e</span>\n");
      out.write("                    <span>m</span>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <a>SignUp</a>   \n");
      out.write("                <a class=\"active\">Login</a>                 \n");
      out.write("            </div>\n");
      out.write("        </nav>             \n");
      out.write("        <div style=\"width: 100%;float: left;\">                   \n");
      out.write("            <div class ='main main2'>\n");
      out.write("                <h3>Ranking</h3>\n");
      out.write("                <ol>\n");
      out.write("                ");
 try{
                        String ad = request.getAttribute("ad").toString();
                        if (ad.equals("admin")) {  
                            Class.forName("org.apache.derby.jdbc.ClientDriver");  
                            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/voting_system","veenayak","qwerty");  
                            Statement stmt=con.createStatement();  
                            String query = "select * from rank order by votes desc";
                            ResultSet rs=stmt.executeQuery(query);
                           
                            while(rs.next()){
                                out.println("<li class='items'>&nbsp;&nbsp;"+rs.getString(1));
                                out.println("<span>"+rs.getInt(2)+"</span></li>");
                            }
                           
                        }
                        else{
                            out.println("<p style='width: 100%;text-align: center;'>Result will be declared in</p>");
                            out.println("<script></script>");
                        }
                    }
                    catch (Exception e) {
                        out.println("Error");
                    }                
                
      out.write("\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <h3>Contestants\n");
      out.write("                ");
  try {
                        String ad2 = request.getAttribute("ad").toString();
                        if(ad2.equals("admin")){
                            out.println("<i class ='fa fa-plus' id ='contestants'></i></h3>"); 
                        }
                    }
                    catch(Exception e){

                    }
                
      out.write("\n");
      out.write("                </h3>\n");
      out.write("                <p>\n");
      out.write("                    ");
  try {
                        String username =request.getAttribute("user").toString();                        
                            String ad = request.getAttribute("ad").toString();
                            if (ad.equals("admin")) {
                                out.println(username + "(" + ad + ")");
                            } else {
                                out.println(username);
                            }
                        } catch (Exception e) {
                            out.println("Error");
                        }
                    
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <div class=\"maind\">\n");
      out.write("                    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>                                                         \n");
      out.write("            </div>  \n");
      out.write("            ");
  try {
                String ad = request.getAttribute("ad").toString();
                if(ad.equals("admin")){
                    out.println("<div id='modal1'><div id='modal12'><fieldset><legend style='font-size: 25px;text-transform: uppercase;'>Add Contestant</legend><div><label for='user'><i class='fa fa-user'></i></label><input type='text name='name' id='name' placeholder ='name' required><button type='submit' id='submit'>Add</button></div><i class ='fa fa-close close'></i></fieldset></div></div>");
                }
            }
                catch (Exception e) {
                    out.println("Error");
                }                
            
      out.write("       \n");
      out.write("        </div>\n");
      out.write("    </body>          \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("ds");
    _jspx_th_sql_setDataSource_0.setDriver("org.apache.derby.jdbc.ClientDriver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:derby://localhost:1527/voting_system");
    _jspx_th_sql_setDataSource_0.setUser("veenayak");
    _jspx_th_sql_setDataSource_0.setPassword("qwerty");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("query2");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ds}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("Select * from rank");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${query2.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("result");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div>\n");
          out.write("                            <p>\n");
          out.write("                                ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" \n");
          out.write("                            </p>\n");
          out.write("                            <button>Vote</button>\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
