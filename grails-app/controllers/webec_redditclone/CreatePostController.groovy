package webec_redditclone

import com.redditclone.Posts
import com.redditclone.auth.User
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class CreatePostController {

    def springSecurityService

    def newPost() {
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
