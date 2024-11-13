import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            // Lê o conteúdo do arquivo input.json
            String content = new String(Files.readAllBytes(Paths.get("input.json")));
            JSONObject json = new JSONObject(content);
            
            // Extrai o campo "name" do JSON
            String name = json.getString("name");
            System.out.println("Olá, " + name + "!");
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo.");
        } catch (Exception e) {
            System.out.println("Erro ao analisar JSON.");
        }
    }
}
