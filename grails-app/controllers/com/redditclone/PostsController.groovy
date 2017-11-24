package com.redditclone

import com.redditclone.auth.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class PostsController {

    def springSecurityService

    def index() {
        def post = new Posts(title: params.title, url: params.url)
        post.author = lookupPerson()
        post.save()
    }

    private lookupPerson(){
        User.get(springSecurityService.currentUserId)
    }
}
