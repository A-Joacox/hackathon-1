package GitHubModels;

import GitHubModels.GitHubModelsService;
import com.example.hackathon1.RequestLog.RequestLog;
import com.example.hackathon1.RequestLog.RequestLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// ...

@RestController
@RequestMapping("/api/ai")
public class GitHubModelsController {

    private final GitHubModelsService service;
    private final RequestLogRepository logRepo;

    // Inyectamos también el repositorio de logs
    @Autowired
    public GitHubModelsController(GitHubModelsService service,
                                  RequestLogRepository logRepo) {
        this.service = service;
        this.logRepo = logRepo;
    }

    // … tus endpoints chat/completion/multimodal/deepspeak …

    // 2.1 GET /api/ai/models
    @Value("${github.models.available}")
    private String availableModels;   // coma-separados

    @GetMapping("/models")
    public List<String> listModels() {
        return Arrays.asList(availableModels.split(","));
    }

    // 2.2 GET /api/ai/history
    @GetMapping("/history")
    public List<RequestLog> history(@RequestHeader("X-User-Id") Long userId) {
        return logRepo.findAllByUserId(userId);
    }
}
