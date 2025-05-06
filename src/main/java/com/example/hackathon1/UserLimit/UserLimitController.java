package com.example.hackathon1.UserLimit;

import com.example.hackathon1.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company/users/{userId}/limits")
public class UserLimitController {

    @Autowired
    private UserLimitService limitService;

    @PostMapping
    public ResponseEntity<UserLimit> assign(@PathVariable Long userId,
                                            @RequestBody UserLimit l) {
        l.setUser(new User(userId,null,null,null,null,null)); // sólo ID
        return ResponseEntity.ok(limitService.assign(l));
    }

    @GetMapping
    public ResponseEntity<List<UserLimit>> list(@PathVariable Long userId) {
        return ResponseEntity.ok(limitService.listByUser(userId));
    }
}

