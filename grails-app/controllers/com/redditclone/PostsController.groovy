package com.redditclone

import com.redditclone.auth.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class PostsController {

    def springSecurityService

    def index() {
        def post = new Posts()
        post.setUrl(params.url)
        post.setTitel(params.title)
        post.setAuthor(lookupPerson())
        post.save()

        def user = User.create()
        user.setUsername(params.username)
        user.setPassword(params.password)
        user.setFirstName(params.firstName)
        user.setEmail(params.email)
        user.save()
        println ""

    }


    private lookupPerson(){
        User.get(springSecurityService.currentUserId)
    }
}
