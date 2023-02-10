package com.devsuperior.dslearndemo.resources;


import com.devsuperior.dslearndemo.dto.NotificationDTO;
import com.devsuperior.dslearndemo.dto.UserDTO;
import com.devsuperior.dslearndemo.services.NotificationService;
import com.devsuperior.dslearndemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationsForCurrentUser(Pageable pageable) {

        Page<NotificationDTO> page = notificationService.notificationsForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }
}
