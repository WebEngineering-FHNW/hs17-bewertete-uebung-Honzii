package com.redditclone

import com.redditclone.auth.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER', 'IS_AUTHENTICATED_ANONYMOUSLY'])
class PostsController {

    def springSecurityService

    def index() {
        def post = new Posts()
        post.setUrl(params.url)
        post.setTitel(params.title)
        post.setAuthor(lookupPerson())
        post.save()
        println ""
    }

    private lookupPerson(){
        User.get(springSecurityService.currentUserId)
    }
}
