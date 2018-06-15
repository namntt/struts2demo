<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <sj:head/>
<link type="text/css" rel="stylesheet" href="<c:url value="/common/css/bootstrap.min.css" />" />
</head>
<body>

	
                    <tiles:insertAttribute name="header" />
            
                    <tiles:insertAttribute name="menu" />
                
                    <tiles:insertAttribute name="body" />
              
                    <tiles:insertAttribute name="footer" />
                    
               
                    
                   <script src="<c:url value="/common/js/jquery-3.3.1.min.js" />" crossorigin="anonymous"></script>
                   <script src="<c:url value="/common/js/bootstrap.min.js" />"></script>
                 <script type="text/javascript">
                   $( document ).ready(function() {
                	   $( "#addForm" ).click(function() {
                		   var productId = $("#productId").val();
                		var productName = $("#productName").val();
   						var price = $("#price").val();
   						var description = $("#description").val();
   						var type = $("#type").val();
   						var file = $("#file").val();
   						console.log(description+""+type)
   						$.ajax({
   							type : "POST",
   							url : "hello.action",
   							data : "productName=" + productName + "&price=" + price + "&description=" + description	+ "&type=" + type + "&file=" + file+ "&productId=" + productId,
   							success : function(data) {
   								var ht = data.msg;
   								$("#resp").html(ht);
   								console.log(data)
   							},
   							error : function(data) {
   								console.log("Loi roi")
   							}
   						});
                		 });
                	});
					
				</script> 
                   

                   

                    

                    
            
</body>
</html>