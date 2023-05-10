<%--
  Created by IntelliJ IDEA.
  User: Thu Nguyen
  Date: 5/10/2023
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h1>Product Discount Calculator</h1>
  <form action="/display_discount" method="post">
    <table>
      <tr>
        <td>Product Description: </td>
        <td>
          <input type="text" name="description">
        </td>
      </tr>
      <tr>
        <td>List Price: </td>
        <td>
          <input type="number" name="price">
        </td>
      </tr>
      <tr>
        <td>Discount Percent: </td>
        <td>
          <input type="number" name="percent" value="%">
        </td>
      </tr>
    </table>
    <input type="submit" name="calculate" value="Calculate Discount">
  </form>
  </body>
</html>
