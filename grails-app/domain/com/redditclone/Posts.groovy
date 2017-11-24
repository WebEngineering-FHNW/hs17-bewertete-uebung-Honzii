package com.redditclone

import com.redditclone.auth.*

class Posts {

    String titel
    String url
    User author


    String toString(){
        titel + "\n" + url + "\n" + "Erstellt von " + author.username + "\n"
    }

    static constraints = {
        titel (blank: false)
        url (blank: false)
    }
}
