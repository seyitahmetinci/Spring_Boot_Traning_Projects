<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html: charset=UTF-8">
    <title> Create Location</title>

</head>
<body>

        <form action="register"  method="post">

                Id: <b>Otomatik Doldurulur</b>
                Code: <input type="text" name="code" placeholder="Enter Country Code" required/>
                Name: <input type="text" name="name" placeholder="Enter Country Name" required/>
                Type: Urban <input type="radio" name="type" />
                      Rural <input type="radio" name="type"/>
                <input type="submit" name="save" onclick="msg()"/>

        </form>

        <script>
            function msg() {
                alert("Action Continues!");
            }
        </script>

</body>
</html>