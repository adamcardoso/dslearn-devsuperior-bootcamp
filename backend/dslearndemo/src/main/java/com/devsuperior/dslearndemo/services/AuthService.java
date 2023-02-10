package com.devsuperior.dslearndemo.services;

import com.devsuperior.dslearndemo.entities.User;
import com.devsuperior.dslearndemo.repositories.UserRepository;
import com.devsuperior.dslearndemo.services.exceptions.ForbiddenException;
import com.devsuperior.dslearndemo.services.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext()
                    .getAuthentication()
                    .getName(); // get the username of the authenticated user

            return userRepository.findByEmail(username);
        }catch (Exception e) {
            throw new UnauthorizedException("Invalid user");
        }
    }

    public void validateSelfOrAdmin(Long userId) {
        User user = authenticated(); // get the authenticated user

        if (!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")) { // if the authenticated user is not the same as the user to be updated and is not an admin
            throw new ForbiddenException("Access denied");
        }
    }
}
