<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

    <div class="navbar navbar-default navbar-static-top" role="navigation">
        <div class="container">
            <sec:ifNotLoggedIn>
                    <ul class="navbar-left">
                        <a href="/posts" class="button" aria-haspopup="true" role="button">Posts</a>
                    </ul>
                    <ul class="navbar-right">
                        <a href="/login" class="button" aria-haspopup="true" role="button">Login</a>
                        <a href="/register/register" class="button" aria-haspopup="true" role="button">Registrieren </a>
                    </ul>
            </sec:ifNotLoggedIn>
            <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">

                    <sec:ifLoggedIn>
                        <ul class="nav navbar-nav navbar-left">
                            <a href="/posts/index"> Hallo <sec:username/></a>
                        </ul>
                        <ul class="navbar-right">
                            <a href="/createPost" class="button" aria-haspopup="true" role="button">Neuer Post</a>
                            <a href="/posts" class="button" aria-haspopup="true" role="button">Posts </a>
                            <g:link controller="logout">Logout</g:link>
                        </ul>
                    </sec:ifLoggedIn>
                    <g:pageProperty name="page.nav" />

            </div>
        </div>
    </div>

    <g:layoutBody/>

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <asset:javascript src="application.js"/>

</body>
</html>
