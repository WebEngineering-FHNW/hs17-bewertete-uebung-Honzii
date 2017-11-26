package com.redditclone

import com.redditclone.auth.User
import spock.lang.Specification

class PostsSpec extends Specification {
    Posts post
    Posts post2
    User david
    User lukas

    def setup() {
        post = new Posts()
        post2 = new Posts()
        david = new User()
        lukas = new User()

        david.setEmail("David.hunziker@hotmail.com")
        david.setFirstName("David")
        david.setPassword("12345")
        david.setUsername("David77")

        lukas.setEmail("lukas.hunziker@hotmail.com")
        lukas.setFirstName("Lukas")
        lukas.setPassword("12345")
        lukas.setUsername("Lukas3")

        post.setTitel("Google")
        post.setUrl("https://www.google.ch")
        post.setAuthor(david)

        post2.setTitel("Facebook")
        post2.setUrl("https://www.facebook.com")
        post2.setAuthor(lukas)
    }

    def cleanup() {
    }

    void "Test if post title is stored correctly"() {
        expect:
            post.getTitel() == "Google"
            post2.getTitel() == "Facebook"
    }

    void "Test if url is stored correctly"() {
        expect:
        post.getUrl() == "https://www.google.ch"
        post2.getUrl() == "https://www.facebook.com"
    }

    void "Test if first Name of the author is stored correctly"() {
        expect:
        post.getAuthor().firstName == "David"
        post2.getAuthor().firstName == "Lukas"
    }

}
