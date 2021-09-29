<%--
  Created by IntelliJ IDEA.
  User: GodBunny
  Date: 9/28/2021
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Thanks</title>
    <link type="text/css" rel="stylesheet" href="/CSS/main.css" />
</head>

<body>
    <h1>Thanks for joining our email list</h1>
    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${user.email}</span><br />

    <label>FullName:</label>
    <span>${user.name}</span><br />

    <label>Phone:</label>
    <span>${user.phone}</span><br />

    <p>To enter another email address, click on the Back button in your broswer or the Return button shown below.</p>

    <form action="" method="post">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>
