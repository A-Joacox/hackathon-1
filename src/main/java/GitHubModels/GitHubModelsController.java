package GitHubModels;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubModelsController {

    private final GitHubModelsService gitHubModelsService;

    public GitHubModelsController(GitHubModelsService gitHubModelsService) {
        this.gitHubModelsService = gitHubModelsService;
    }

    @GetMapping("/models")
    public String getModels() {
        return gitHubModelsService.listModels();
    }
}
