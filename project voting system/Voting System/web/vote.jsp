<%-- 
    Document   : vote
    Created on : 27 Oct, 2018, 4:56:35 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%     
    if(session.getAttribute("user") == null){
        response.sendRedirect("index.html");
    }
    else{    
%>
<html>
    <!Doctype html>
    <head>
        <title>Voting page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <style type="text/css">
            *{
                font-family: monospace,sans-serif;
                box-sizing: border-box;
            }
            body{
                background: white;
            }
            nav{
                background: #311414;
                padding: 10px 20px;
                float: left;
                height: 48px;
                width: 100%;
                box-shadow: 0px 0px 10px black;
                position: sticky;
                top: 0px;
            }
            nav h1{
                margin: 0px;
                width: 100%;
            }
            nav div{
                width: 50%;
                float: right;
            }
            nav div:first-child{
                float: left;
            }
            nav div a,nav div button{
                padding: 5px 10px;
                float: right;
                text-transform: uppercase;
                font-family: fantasy,sans-serif;
                border: none;
                outline: 0;
            }              
            .active{
                background: #bc3939;
                color: white;
            }
            .head{
                position: relative;
                text-transform: uppercase;
            }
            .head span{
                left: -100px;
                position: absolute;
            }
            .main{
                float: left;
                background: #642020;
                margin: 40px;
                padding: 0px;
                box-sizing: border-box;
                margin-left: 2%;
                margin-right: 2%;
            }
            .main:nth-child(1){
                width: 22%;
                padding-bottom: 42px;
            }
            .main:nth-child(2){
                width: 72%;
                margin-left: 0%;
                float: right;

            }
            .items{
                background: #291d1d;
                padding: 15px;    
                text-transform: capitalize;
                list-style-type: none;
            }   
            .items span{
                float: right;
                background: #544646;
                padding: 0px 10px;
            }
            .items span:first-child{
                float: left
            }
            .main h3{
                margin-top: 0px;
                color: white;
                margin: 0;                
                padding: 10px 10px;
                text-transform: uppercase;
                letter-spacing: 2px;
            }
            .main ol{
                padding-left: 0px;
                background: #291d1d;
                color: white;
                overflow: scroll;
                overflow-x: hidden;
                max-height: 67.5vh;
                margin: 0px;
            }
            .main ol::-webkit-scrollbar{
                width: 2px;
                background: transparent;
            }
            .main ol::-webkit-scrollbar-thumb{
                border-radius: 10px;
                background: black;

            }
            .main ol::-webkit-scrollbar-track{
                width: 5px;
                background: transparent;

            }
            .main:nth-child(2) h3{
                width: 50%;
                float: left;
            }
            .main p{
                width: 50%;
                float: left;
                margin: 0px;
                color: white;
                text-align: left;
                text-transform: capitalize;
                padding: 5px 0px;
            }
            .main p:nth-child(2){
                text-align: right;
                padding: 11.5px;
                color: white;
            }
            .maind{                 
                float: left;
                padding: 0px 10px 10px 10px;
                width: 100%;
            }
            .maind button{
                padding: 7px 10px;
                border: none;
                background: #bc3939;
                color: white;
                float: right;
                outline: none!important;
            }
            .maind button:focus{
                box-shadow: inset 0px 0px 5px #151212;
            }
            .maind div{                 
                float: left;
                padding: 10px 10px;
                width: 33.33%;
                text-align: center;
                text-transform: capitalize;
            }
            #modal1{
                height: 100%;
                display: none;
                top: 0;
                width: 100%;                
                left: 0;
                position: absolute;
                background: rgb(0,0,0,0.7);               
            }
            form{
                background: white;
                box-shadow: 0px 5px 5px 10px black; 
            }
            #modal1>div{
                position: relative;
                clear: both;
                margin: 0px;
                display: inline-block;
                text-align: center;
                left: 50%;
                top: 150px;
                width: 400px;
                padding: 10px;
                box-shadow: 0px 10px 10px #1c0d0d;
                background: #971e1e;
                transform: translatex(-50%);
            }
            fieldset div{
                width: 90%;
                float: left;
                margin-top: 20px;
                margin-left: 5%;
                margin-right: 5%;
            }
            #modal1 fieldset{
                border: none;
                padding: 0px 20px 40px 20px;
                background: #ae2e2e;
                box-shadow: inset 0px 0px 150px #8b1b1b;
            }
            #modal1 label{
                float: left;
                background: #322c2c;
                padding: 10px;
                width: 20%;
                color: white;
            }
            #modal1 legend{
                color: white;
                text-align: left;
            }
            #modal1 button{
                width: 50%;
                text-transform: uppercase;
                background: #322c2c!important;
                color: white;
                float: right;
                outline: none!important;
                border: 0px;
                padding: 10.5px;
                font-family: monospace,sans-serif;
                margin-top: 15px;
            }
            #modal1 input{
                outline: none!important;
                border: 0px;
                float: left;
                padding: 10.5px;
                color: white;
                text-transform: uppercase;
                font-family: monospace;
                background: #4b3939!important;
                width: 80%;
            }
            .close{
                position: absolute;
                top: 10px;
                right: 15px;           
            }
            #cont{
                clear: both; 
                padding: 10px 20px;
                color: white;
            }
            .main i:hover{
                color: black;
            }
        </style>
        <script>
            $(document).ready(function () {
                $("nav a").click(function () {
                    $("nav a").removeClass("active");
                    $(this).addClass("active");
                });
                $("nav a:eq(1)").click(function () {
                    $("#signup").hide();
                    $("#login").show();
                });
                $("nav a:eq(0)").click(function () {
                    $("#login").hide();
                    $("#signup").show();
                });
            });
            i = 0;
            $(document).ready(function () {
                var len = $(".head span").length;
                i = len;
                var interval = setInterval(function () {
                    $(".head span:eq(" + i + ")").animate({left: 10 + 20 * i});
                    i--;
                    if (i < 0) {
                        clearInterval(interval);
                    }
                    console.log(i);
                }, 150);
            });
            $(document).ready(function () {
                $(".maind button").click(function () {
                    var name = $(this).parent().children("p").text();
                    <%} String username2 =session.getAttribute("user").toString();out.println("var username="+"'"+username2+"'");%>;
                    <% String username3 =session.getAttribute("ad").toString();out.println("var user="+"'"+username3+"'");%>;
                    $.ajax({
                        type: "GET",
                        url: "Voting",
                        data: "name=" + name+"&username="+username,
                        success: function (msg) {
                            var obj = JSON.parse(msg);
                            if(user =="admin"){
                                $(".main:first-child ol").html(obj.msg1); 
                            }
                            if(obj.msg ==10){ 
                                alert("You have already voted!!");
                            }
                            else{
                                alert("Success!!");
                                $("#cont").html(obj.msg2);
                            }
                        },
                        error: function () {
                            alert("failed");
                        }
                    });
                });                            
            });
            $(document).ready(function () {
                $("#contestants").click(function () {
                    $("#modal1").show();
                });
                $("#modal1 .close").click(function () {
                    $("#modal1").hide();
                });
                $("#submit").click(function () {
                    if($("#name").val()!=""){
                        var name =$("#name").val();
                        console.log(name);
                        $.ajax({
                            type: "GET",
                            url: "Contestants",
                            data: "name="+name,
                            success: function (msg) {
                                var obj = JSON.parse(msg);
                                if(obj.failed=="true"){
                                    alert("Username already exists!!");
                                }
                                else{
                                    var msg1 = obj.rank;
                                    var msg2 = obj.contestants;
                                    $(".maind").append(msg2);
                                    $(".main:first-child ol").html(msg1);
                                    $("#modal1").hide();
                                }
                            },
                            error: function () {
                                alert("failed");
                            }
                        });
                    }
                });                            
            });
            $(document).ready(function(){
                var i=0;
                var len = $(".items").length;
                for(i=0;i<len;i++){
                    $(".items:eq("+i+")").prepend("<span>"+parseInt(i+1)+"</span>");
                }
            });
            $(document).ready(function(){
               $(".active").click(function(){
                   $.ajax({
                       type: "GET",
                       url: "Invalidate",
                        success: function (msg) {
                            window.location = "index.html";
                        },
                        error: function () {
                            alert("failed");
                        }
                   });
               }); 
            });
        </script>
    </head>
    <body style="margin:0px;">
        <nav>
            <div>
                <h1 class= "head">
                    <span>v</span>
                    <span>o</span>
                    <span>t</span>
                    <span>i</span>
                    <span>n</span>
                    <span>g</span>
                    <span> </span>
                    <span>s</span>
                    <span>y</span>
                    <span>s</span>
                    <span>t</span>
                    <span>e</span>
                    <span>m</span>
                </h1>
            </div>
            <div>                
                <button class="active">Logout</button>                 
            </div>
        </nav>             
        <div style="width: 100%;float: left;">                   
            <div class ='main main2'>
                <h3>Ranking</h3>
                <ol>
                <% try{
                        String ad = session.getAttribute("ad").toString();
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
                %>
                </ol>
            </div>
            <div class="main">
                <h3>Contestants
                <%  try {
                        String ad2 = session.getAttribute("ad").toString();
                        if(ad2.equals("admin")){
                            out.println("<i class ='fa fa-plus' id ='contestants'></i></h3>"); 
                        }
                    }
                    catch(Exception e){

                    }
                %>
                </h3>
                <p>
                    <%  try {
                        String username = session.getAttribute("user").toString();                        
                            String ad = session.getAttribute("ad").toString();
                            if (ad.equals("admin")) {
                                out.println(username + "(" + ad + ")");
                            } else {
                                out.println(username);
                            }
                        } catch (Exception e) {
                            out.println("Error");
                        }
                    %>
                </p>
                <div class="maind">
                    <sql:setDataSource var= "ds" driver ="org.apache.derby.jdbc.ClientDriver" url ="jdbc:derby://localhost:1527/voting_system" user ="veenayak" password ="qwerty"/>
                    <sql:query var= "query2" dataSource= "${ds}">Select * from rank</sql:query>
                    <c:forEach items= "${query2.rows}" var ="result">
                        <div>
                            <p>
                                <c:out value= "${result.name}"></c:out> 
                            </p>
                            <button>Vote</button>
                        </div>
                    </c:forEach>
                </div>
                <div id='cont'>
                    <% try{
                            String user = session.getAttribute("user").toString();
                            Class.forName("org.apache.derby.jdbc.ClientDriver");  
                            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/voting_system","veenayak","qwerty");  
                            Statement stmt=con.createStatement();  
                            String query = "select * from voters where name ='"+user+"'";
                            ResultSet rs2=stmt.executeQuery(query);
                            while(rs2.next()){
                                if (user.equals(rs2.getString(1))) {  
                                    out.println("You voted for "+rs2.getString(2));
                                    break;
                                }                           
                            }
                        }
                        catch (Exception e) {
                            out.println("Error");
                        }                
                    %>
                </div>
            </div>  
            <%  try {
                String ad = session.getAttribute("ad").toString();
                if(ad.equals("admin")){
                    out.println("<div id='modal1'><div id='modal12'><fieldset><legend style='font-size: 25px;text-transform: uppercase;'>Add Contestant</legend><div><label for='user'><i class='fa fa-user'></i></label><input type='text name='name' id='name' placeholder ='name' required><button type='submit' id='submit'>Add</button></div><i class ='fa fa-close close'></i></fieldset></div></div>");
                }
            }
                catch (Exception e) {
                    out.println("Error");
                }                
            %>       
        </div>
    </body>          
</html>