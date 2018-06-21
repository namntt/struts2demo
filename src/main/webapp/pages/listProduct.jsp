<%@ taglib uri="/struts-tags" prefix="s" %>  
<s:if test="productList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Price</th>
		<th>Image</th>
		<th>Description</th>
		<th>Type</th>
	</tr>
	<s:iterator value="productList" status="productStatus">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="name" /></td>
			<td><s:property value="price" /></td>
			<td><s:property value="image" /></td>
			<td><s:property value="description" /></td>
			<td><s:property value="type" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>


