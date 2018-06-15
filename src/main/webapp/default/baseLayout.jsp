<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
                   

                   

                    

                    
            
</body>
</html>