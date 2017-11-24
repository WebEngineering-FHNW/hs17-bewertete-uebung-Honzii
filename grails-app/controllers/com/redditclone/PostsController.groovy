package com.redditclone

import com.redditclone.auth.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class PostsController {

    def springSecurityService

    def index() {
        def posts = currentUserTimeline()
        return [message: posts]
    }

    def updatePost = {
        def post = new Posts(message: params.message, url: params.url)
        post.author = lookupPerson()
        post.save()

        def messages = currentUserTimeline()
        render template: 'posts', collection: messages, var: 'message'
    }

    private currentUserTimeline() {
        return getAuthenticatedUser()
    }

    private lookupPerson() {
        User.get(springSecurityService.principal.identity {})
    }


}
