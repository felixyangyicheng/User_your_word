<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="assets/css/style.css" media="screen" type="text/css" />
		<title>Login</title>
	</head>
	<body>
	 	<div id="container">
			<form method="POST">
	               <h1>Rejoindre une partie</h1>
	               <label><b>Code session</b></label>
	               <input type="text" placeholder="Entrer l'id de session" name="sessionId" required>
	               <input type="submit" id='submit' value='Rejoindre' >
	           </form>
	       </div>
	</body>
</html>