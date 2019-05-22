<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
 
<body>
<h1>Sample Web Application With Maven</h1>
 
<h2>Enter Book Details Here</h2>
<s:form action="addBookAction" >
  <s:textfield name="name" label="Name" value="" />
  <s:textfield name="authorName" label="Author Name" value=""  />
  <s:textfield name="price" label="Price" value=""  />
  <s:submit />
</s:form>
 

 
<s:if test="bookList.size() > 0">
<h2>Currently Available Books</h2>
<table border="1px" cellpadding="8px">
	<tr>
		<th>Book Id</th>
		<th>Name</th>
		<th>Author Name</th>
		<th>Price<th>
		<th>Issued Date</th>
	</tr>
	<s:iterator value="bookList" status="userStatus">
		<tr>
			<td><s:property value="bookId" /></td>
			<td><s:property value="name" /></td>
			<td><s:property value="authorName" /></td>
			<td><s:property value="price" /></td>
			<td><s:date name="issuedDate" format="dd/MM/yyyy" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>
<br/>
 
</body>