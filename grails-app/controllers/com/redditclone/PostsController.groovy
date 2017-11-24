package com.redditclone

import com.redditclone.auth.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class PostsController {

    def springSecurityService

    def index() {
        def post = new Posts()
        post.setUrl(params.url)
        post.setTitel(params.title)
        post.setAuthor(lookupPerson())
        post.save()
    }

    private lookupPerson(){
        User.get(springSecurityService.currentUserId)
    }
}
