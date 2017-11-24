<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>
<h1>Was gibts neues?</h1><br>

<div>
    <form action="/posts">
        <h3>Title:</h3>
        <input type="text" name="title"><br>
        <h3>URL:</h3>
        <input type="url" name="url">
        <br /><br />
        <input type="submit" value="Posten">
    </form>
</div>
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
