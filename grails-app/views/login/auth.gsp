<html>
<head>
    <meta name="layout" content="${gspLayout ?: 'main'}"/>
    <title><g:message code='springSecurity.login.title'/></title>
    <asset:stylesheet src="application.css"/>
</head>

<body>
<div id="login">
    <div class="inner">
        <br><h1 class="fheader"><b><g:message code='springSecurity.login.header'/></b></h1><br>

        <g:if test='${flash.message}'>
            <b><h1 class="login_message">${flash.message}</h1></b><br>
        </g:if>

        <form action="${postUrl ?: '/login/authenticate'}" method="POST" id="loginForm" class="cssform" autocomplete="off">
                <h1 for="username"><g:message code='springSecurity.login.username.label'/>:</h1>
                <input type="text" class="text_" name="${usernameParameter ?: 'username'}" id="username"/>
                <h1 for="password"><g:message code='springSecurity.login.password.label'/>:</h1>
                <input type="password" class="text_" name="${passwordParameter ?: 'password'}" id="password"/>
                <br><br><br>
                <input type="submit" id="submit" value="${message(code: 'springSecurity.login.button')}"/>
        </form>
    </div>
</div>
<script>
    (function() {
        document.forms['loginForm'].elements['${usernameParameter ?: 'username'}'].focus();
    })();
</script>
</body>
</html>
