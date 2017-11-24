package com.redditclone.auth

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_USER')
class AuthController {

    def index() { }
}
