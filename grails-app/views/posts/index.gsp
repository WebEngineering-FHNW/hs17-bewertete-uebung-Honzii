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
        <g:textField type="text" name="title"></g:textField><br>
        <h3>URL:</h3>
        <g:textField type="url" name="url"></g:textField>
        <br /><br />
        <g:submitButton type="submit" name="Posten"></g:submitButton>
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
