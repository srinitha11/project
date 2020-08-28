<%@include file="commonheader.jsp"%>

<form action="CredentialCheck" method="post">
	<table align="center" cellspacing="1">
	<tr bgcolor="DarkSeaGreen">
		<td colspan="2">
			<h2 align="center">Sign In </p> 
		</td>
	</tr>
	<tr>
		
		<td>Mobile</td><td><input type="text" name="mobile" pattern="[789]\d{9}" required/></td>
	</tr>
	<tr>
		<td>Password</td><td><input type="password" name="password" required/></td>
	</tr>	
	<td colspan="2" align="center">
		<input type="submit" value="Sign In"/>
		<input type="reset" value="RESET"/>
	</td>
	</tr>
	</form>

</body>
</html>