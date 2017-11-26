<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="application.css"/>
</head>
<body>
<div>
    <br>
    <h1><b>Posts</b></h1>
    <g:each in="${com.redditclone.Posts.getAll()}" var="p">
        <h1><br>
            <a target="_blank" href="${p.url}"> ${p.titel} </a><br>
            Erstellt von "${p.author.username}"
        </h1>
    </g:each>
</div>
</body>
</html>
