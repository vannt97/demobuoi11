<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <form action="<%= request.getContextPath() %>/wellcome" method="post">
      <label for="">UserName: </label>
      <input type="text" name="username"  />
      <label for=""></label>
      <input type="text" name="password"  />
       <input type="submit" value="register">
    </form>
  </body>
</html>
