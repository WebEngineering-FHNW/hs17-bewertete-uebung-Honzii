<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'role.label', default: 'Role')}" />
    <title><g:message code="default.create.label" args="[entityName]" /></title>
</head>
<body>
<div>
    <g:form url="[action: 'updatePost']" update="messages" name="updateRedditClone">
    <h3>Title:</h3>
    <g:textField name="message"/>
    <br />
    <h3>URL:</h3>
    <g:textField name="url"/>
    <br /><br />
    <g:submitButton name="post"/>
    </g:form>
</div>
<div id="posts">
    <g:render template="posts" collection="${message}" var="message"/>
</div>
</body>
</html>
