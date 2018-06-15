<%@ taglib uri="/struts-tags" prefix="s" %>  
<%-- <div>
	<s:form action="hello" method = "post" enctype = "multipart/form-data">  
		<s:textfield name="productId" key="global.productId"></s:textfield>  
		<s:textfield  key="global.productName" name="productName"></s:textfield>  
		<s:textfield name="price" key="global.price"></s:textfield> 
        <s:textarea key = "global.description" name = "description" />
        <s:select name = "type" key = "global.type"
            list = "{'Electric','Food'}" />
		 
        <s:file label="File" name="productImage"></s:file>
		<s:submit value="save"></s:submit> 
		 
	</s:form> 
</div>
 --%>
<div class="container">
<form action="hello" method = "post" enctype = "multipart/form-data">
  <div class="form-group">
    <label for="exampleInputEmail1">Ma san pham</label>
    <input type="text" name="productId" class="form-control" id="exampleInputEmail1" disabled>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Ten san pham</label>
    <input type="text" name="productName" class="form-control" id="exampleInputPassword1" placeholder="Nhap thong tin san pham">
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">Gia san pham</label>
    <input type="text" name="price" class="form-control" id="exampleInputPassword1" placeholder="Nhap gia san pham">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Mo ta</label>
	<textarea name="description" class="form-control" rows="3"></textarea>
  </div>
  	  <label for="exampleInputPassword1">Loai mat hang</label>
	  <select name="type" class="form-control">
	  <option>1</option>
	  <option>2</option>
	  <option>3</option>
	  <option>4</option>
	  <option>5</option>
	</select>
  
  <div class="form-group">
    <label for="exampleInputFile">Anh san pham</label>
    <input type="file" name="productImage" id="exampleInputFile">
    
  </div>
 
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</div>