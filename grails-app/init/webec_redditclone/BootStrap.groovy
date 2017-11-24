package webec_redditclone

import com.redditclone.Posts
import com.redditclone.auth.Role
import com.redditclone.auth.User
import com.redditclone.auth.UserRole

class BootStrap {

    def init = { servletContext ->
        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def userRole = Role.findOrSaveWhere(authority: 'ROLE_USER')

        def admin = User.findOrSaveWhere(username: 'admin', password: 'adminadmin', firstName: 'David', lastName: 'Hunziker', email: 'david.hunziker3@students.fhnw.ch')
        def user = User.findOrSaveWhere(username: 'Hunziker', password: 'useruser', firstName: 'David', lastName: 'Hunziker', email: 'david.hunziker3@students.fhnw.ch')
        def user2 = User.findOrSaveWhere(username: '1', password: '1', firstName: 'David', lastName: 'Hunziker', email: 'david.hunziker3@students.fhnw.ch')

        if (!admin.authorities.contains(adminRole)){
            UserRole.create(admin, adminRole,true)
        }

        if (!user.authorities.contains(adminRole)){
            UserRole.create(user,userRole,true)
            UserRole.create(user2,userRole,true)
        }

        Date today = new Date().clearTime();
        new Posts(titel: "Google", url: "https://google.ch", author:  admin).save(failOnError: true)
        new Posts(titel: "Stackoverflow", url: "https://stackoverflow.com", author:  user).save(failOnError: true)

    }
    def destroy = {
    }
}
