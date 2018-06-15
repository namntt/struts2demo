<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<div class="container">
	<p style="color:red;"><s:actionerror/></p> 
     <%--  <s:form action="product">
      
      	<s:textfield name="name" label="Username"></s:textfield>
      	
      	<s:password name="password" label="Password"></s:password>  
      	
      	<sj:submit value="Login"></sj:submit>
		 
      </s:form> --%>
      
      <form class="form-horizontal" action="product" role="form" id="myForm" method="post">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Username</label>
    <div class="col-sm-5">
      <input type="text" name="name" class="form-control" id="inputEmail3" placeholder="Username">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-5">
      <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" id="submit">Sign in</button>
    </div>
  </div>
</form>
</div>

<%-- <script>

$( document ).ready(function() {
	$("submit").click(function(){
        var formData = $("#myForm").serialize(); //get all data from form
          //do the POST thingies
          console.log(formData);
        $.ajax({
            type: "POST",
            url: "<s:url action='product'/>",
            cache: false,
            data: formData,
            success: onSuccess,
            error: onError
        });

        return false;
});
});
</script> --%>