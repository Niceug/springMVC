<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <h1>${time}</h1>

    <form action="/login" method="POST">
        <input type="text" name="username" placeholder="Username"/> <br />
        <input type="password" name="password" placeholder="Password"/> <br />
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
