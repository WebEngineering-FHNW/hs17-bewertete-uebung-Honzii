package webec_redditclone

import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class AboutController {

    def about() { }
}
