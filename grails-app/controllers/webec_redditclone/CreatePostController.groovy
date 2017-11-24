package webec_redditclone

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class CreatePostController {
    def newPost() { }
    
}
