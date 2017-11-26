package com.redditclone

import com.redditclone.auth.Role
import com.redditclone.auth.User
import com.redditclone.auth.UserRole
import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class PostsController {

    def springSecurityService

    def userRole = Role.findOrSaveWhere(authority: 'ROLE_USER')

    private unique(name) {
        for (int i=0; i<User.getAll().username.toArray().length; i++){
            if (User.getAll().username.get(i) == name){
                return false
            }
        }
        return true
    }

    def index() {
        def post = new Posts()
        post.setUrl(params.url)
        post.setTitel(params.title)
        post.setAuthor(lookupPerson())
        post.save()

        if (params.username != null && unique(params.username)){
            def user = User.findOrSaveWhere(username: params.username, password: params.password, firstName: params.firstName, email: params.email)
            UserRole.create(user,userRole, true)
            user.save()
        }

        grails_artefact_controller_support_RequestForwarder__urlConverter
        println()
    }

    private lookupPerson(){
        User.get(springSecurityService.currentUserId)
    }
}
