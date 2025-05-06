package GitHubModels;

import com.github.models.GitHubModelsClient;
import com.github.models.GitHubModelsClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GitHubModelsConfig {

    @Value("${github.models.apiKey}")
    private String apiKey;

    @Bean
    public GitHubModelsClient gitHubModelsClient() {
        return new GitHubModelsClientBuilder()
                .apiKey(apiKey)
                .build();
    }
}
