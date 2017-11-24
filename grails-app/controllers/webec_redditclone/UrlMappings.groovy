package webec_redditclone

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:'/posts/index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
