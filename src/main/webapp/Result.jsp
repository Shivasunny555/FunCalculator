<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESULT</title>

<style>
img{
	height : 20%;
	width : 20%;
}
body {
    text-align: center;
    background-color: #225999;
}
h1{
color: white;
margin:15px;
}

a{
	color:black;
	font-family:bold;
	font-size:20px;
}
</style>

</head>
<body>
<img alt="" src="images/giphy (3).webp">

<h1>JOKE OF THE DAY !</h1>

<h2><%=request.getParameter("joke")%></h2>
<h1>Ans =<%=request.getParameter("ans")%></h1>
    <a href="index.html">Click here to calculate again!</a>
</body>
</html>      