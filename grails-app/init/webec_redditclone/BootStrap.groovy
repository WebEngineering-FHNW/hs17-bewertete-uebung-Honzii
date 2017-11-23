package webec_redditclone

import com.redditclone.auth.Role
import com.redditclone.auth.User
import com.redditclone.auth.UserRole

class BootStrap {

    def init = { servletContext ->
        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def userRole = Role.findOrSaveWhere(authority: 'ROLE_USER')

        def admin = User.findOrSaveWhere(username: 'admin', password: 'adminadmin', firstName: 'David', lastName: 'Hunziker', email: 'david.hunziker3@students.fhnw.ch')
        def user = User.findOrSaveWhere(username: 'user', password: 'useruser', firstName: 'David', lastName: 'Hunziker', email: 'david.hunziker3@students.fhnw.ch')

        if (!admin.authorities.contains(adminRole)){
            UserRole.create(admin, adminRole,true)
        }

        if (!user.authorities.contains(adminRole)){
            UserRole.create(user,userRole,true)
        }
    }
    def destroy = {
    }
}
