<%@ taglib uri="/struts-tags" prefix="s" %>  
<div class="container">
<s:form enctype = "multipart/form-data" validate="true" action="hello" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Ma san pham</label>
    <s:textfield  name="productId"  id="productId" cssClass="form-control" disabled="true"></s:textfield>
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Ten san pham</label>
    <s:fielderror fieldName="productName"/>
    <s:textfield name="productName" class="form-control" id="productName" placeholder="Nhap thong tin san pham"></s:textfield>
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">Gia san pham</label>
    <s:fielderror fieldName="price"/>
    <s:textfield name="price" class="form-control" id="price" placeholder="Nhap gia san pham"></s:textfield>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Mo ta</label>
	<s:textarea name="description" id="description" class="form-control" rows="3"/>
  </div>
  	  <label for="exampleInputPassword1">Loai mat hang</label>
	  <s:select name="type" id="type" class="form-control" list="{'Dien tu','Thuc Pham','Do da dung'}"/>
	  
  
  <div class="form-group">
    <label for="exampleInputFile">Anh san pham</label>
    <s:file name="productImage" id="file"></s:file>
    
  </div>
 
  <button type="submit" id="addForm" class="btn btn-default">Submit</button>
  <!-- <div class="text-center" id="resp" style="margin-top: 14px;"></div> -->
</s:form>
</div>



