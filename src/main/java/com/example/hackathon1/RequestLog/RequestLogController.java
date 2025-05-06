package com.example.hackathon1.RequestLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ai")
public class RequestLogController {

    @Autowired
    private RequestLogService logService;

    @GetMapping("/history")
    public ResponseEntity<List<RequestLog>> history(@RequestParam Long userId) {
        return ResponseEntity.ok(logService.historyByUser(userId));
    }

    @GetMapping("/admin/history")
    public ResponseEntity<List<RequestLog>> historyByCompany(@RequestParam Long companyId) {
        return ResponseEntity.ok(logService.historyByCompany(companyId));
    }
}

