# WebEngineering Module, Graded Exercise

## Commit Proposal

Matriculation Number: 16-967-333

Project idea short description: 

Reddit Clone.
* User Autentifikation
* Eingabe eines URL's und einer Beschreibung
* Anzeigen der Posts

## Project confirmation

Confirmed

Cool idea.
You might want to look into Spring Security and its respective Grails plugins.
Also this kind of service is alsways prone to xss attacks and spam.
It would be cool to either address these issues technically or have at
least a statement about it (where "we ignore these issues" would also be ok).

Go for it!

## Project delivery <to be filled by student>

How to start the project: grailsw run-app

How to test the project:  grailsw test-app

Project description: /about.gsp

External contributions:
Keine direkten Codekopien

Other comments: 
Die Projekt Beschreibung ist direkt auf der Homepage ersichtlich und unter dem "About" Button erreichbar.

I'm particular proud of:
Auf die Login Funktion und die Einschränkung, dass nur registrierte Nutzer Posts erstellen können.

## Project grading 

Description: not the static html as requested. Validation shows 5 errors (< ul > and < a > mixing).
h2 is for headings, not for running text.
Works: NullPointerException beim Registrieren (UserRole.groovy:54).

Functionality: 
Basic navigation for login, create post, show all posts.
User input for login plus post.
Syntactic in-place validation (email, link), user validation against DB.
Domain with user, role, their relation and posts as entities.

Engineering:
Sensible number of git commits, commit comments could be more descriptive.
Tests are mostly true == true, which give a wrong impression when one sees them passing.
PostsSpec tests one happy path.
Comments are sparse - but there is little need for commenting.
Naming is ok.
There is some duplication due to the use of static scaffolding views where 
dynamic scaffolding would suffice but that is beyond our scope, so full points here.

I award two extra points for the additional effort that it takes
to learn how role-based security with Spring works (we did not cover this topic
in the lectures).

Congratulations!
Total grade: 5.8