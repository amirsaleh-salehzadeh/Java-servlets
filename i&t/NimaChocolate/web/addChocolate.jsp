<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="common.Brand" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Add Category</title>
</head>

<body>
<form id="form1" name="form1" method="post" action="addChocolate">
<table width="332" border="1">
  <tr>
    <td width="120">Chocolate Name: </td>
    <td width="196"><input type="text" name="name" /></td>
  </tr>
  <tr>
    <td valign="top">Chocolate Description: </td>
    <td>
        <label>
          <textarea name="description" rows="6" cols="30"></textarea>
        </label>
    </td>
  </tr>
  <tr>
    <td>Image Path </td>
    <td><input type="text" name="image" /></td>
  </tr>
  <tr>
    <td>Price</td>
    <td><input type="text" name="price" /></td>
  </tr>
  <tr>
    <td>Brand Name </td>
    <td><label>
      <select name="brandName">
            <%
                ArrayList<Brand> arrayList =(ArrayList<Brand>)session.getAttribute("brandList");
                for(int i = 0; i < arrayList.size(); i++)
                {                         
                    out.println("<option>"); 
                    out.println(arrayList.get(i).getBrandName());
                    out.println("</option>");
               }        
            %>
          
          
      </select>
      </label></td>
  </tr> 
  <tr>
    <td colspan="2" align="center">
        <input type="submit" name="Submit" value="Add Chocolate" />
    </td>
  </tr>
</table>
</form>
</body>
</html>
