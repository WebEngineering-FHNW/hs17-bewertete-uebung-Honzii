<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="application.css"/>
</head>
<body>
<div>

    <g:each in="${com.redditclone.Posts.getAll()}" var="p">
        <h1><br>
            <a href="${p.url}"> ${p.titel} </a><br>
            Erstellt von "${p.author.username}"
        </h1>
    </g:each>
</div>
</body>
</html>
