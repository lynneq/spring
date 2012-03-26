<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Todo List</title>
</head>
<body>
<h1>Todo List</h1>
<div class = "todolists">
    <table id = "todo_list_table">
        <tr>
            <td>${message}</td>
        </tr>
    <#assign seq = container>
    <#list seq as x>
        <tr>
            <td>
                ${x_index + 1}. ${x}<#if x_has_next> </#if>
            </seq>
            </td>
        </tr>
    </#list>
    </table>
</div>

<form name="input" action="todolist.html" method="post">
    <input type="text" name="task"/>
    <input type="submit" name="Submit"/>
</form>

</body>
</html>
