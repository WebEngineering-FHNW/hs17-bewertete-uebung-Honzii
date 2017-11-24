package com.redditclone

import com.redditclone.auth.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER', 'IS_AUTHENTICATED_ANONYMOUSLY'])
class PostsController {

    def index() {

    }

}
