<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<s:url action="product.action" var="urlTag" escapeAmp="false">
   <s:param name="name">admin</s:param>
   <s:param name="password">123456</s:param>
    
</s:url>
      <a href="<s:property value="#urlTag" />" >Them san pham</a>

      
      <table class="table">
      	<tr>
  			<td>Ma san pham</td>
  			<td>Ten san pham</td>
  			<td>Gia</td>
  			<td>Mo ta</td>
  			<td>Link anh</td>
  			<td>Loai mat hang</td>
  		</tr>
  		<tr>
  			<td><s:property value = "productId"/></td>
  			<td><s:property value = "productName"/></td>
  			<td><s:property value = "price"/></td>
  			<td><s:property value = "description"/></td>
  			<td><s:property value = "productImageFileName"/></td>
  			<td><s:property value = "type"/></td>
  		</tr>
  		
	  </table>
      
      
