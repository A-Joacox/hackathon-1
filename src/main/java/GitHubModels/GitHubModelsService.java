package GitHubModels;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class GitHubModelsService {

    private final String GITHUB_API_URL = "https://api.github.com/models";  // URL de la API de GitHub Models
    private final String GITHUB_TOKEN;

    private final RestTemplate restTemplate;

    public GitHubModelsService(@Value("${github.token}") String githubToken, RestTemplate restTemplate) {
        this.GITHUB_TOKEN = githubToken;
        this.restTemplate = restTemplate;
    }

    public String listModels() {
        // Configuración de las cabeceras para la autenticación
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + GITHUB_TOKEN);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        // Realizar la solicitud GET
        ResponseEntity<String> response = restTemplate.exchange(
                GITHUB_API_URL,
                HttpMethod.GET,
                entity,
                String.class
        );

        return response.getBody();
    }
}

