<%@include file="commonheader.jsp"%>

<form action="Registercontroller" method="post">
	<table align="center" cellspacing="1">
	<tr bgcolor="PowderBlue">
		<td colspan="2">
			<h2 align="center">Sign Up</p> 
		</td>
	</tr>
	<tr>
		<td>Login Name</td><td><input type="text" name="loginName" required/></td>
	</tr>
	
	<tr>
		<td>Password</td><td><input type="password" name="password" required/></td>
	</tr>	
	<tr>
		<td>Email ID</td>
		<td><input type="email" name="emailid" required/></td>
	</tr>
	
	<tr>
		<td>Mobile</td>
		<td><input type="text" name="mobile" pattern="[789]\d{9}" required/></td>
	</tr>
	<td colspan="2">
		<input type="submit" value="Sign Up"/>
		<input type="reset" value="RESET"/>
	</td>
	</tr>
	</form>


</body>
</html>