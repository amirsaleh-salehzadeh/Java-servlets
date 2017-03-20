<%-- 
    Document   : List
    Created on : Jan 18, 2010, 12:17:49 PM
    Author     : 844405
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
            <td><table><%
            ArrayList<CategoryENT> arcategory;
                    arcategory = (ArrayList<CategoryENT>) session.getAttribute("arcategory")
                    if(arcategory==null){
                        for(int i=0;i<arcategorysize();i++ ){
                            %>
                        </td></tr>
                        <a href="Listservlet? category_id=<%arcategoryget(i).getId()%>">
                        <%=arCategory.get(i).getName()%>
                </a></td></tr>
                <%
                }//for
                }//if
                %>
                </table>
                        }
                    }
    </body>
</html>
