import java.util.Map;

public class EnvironmentalVariablesTest {

  public static final String LOGLEVEL = "INFO";

  public static void main(String[] args) {
    EnvironmentalVariablesTest.envVariable();

    String variable = System.getenv("PWD");
    System.out.println(variable);
  }

  public static void envVariable() {
    try {
      ProcessBuilder builder = new ProcessBuilder();
      Map<String, String> env = builder.environment();
      env.put("CHAT_APP_LOGLEVEL", LOGLEVEL);
    } catch (Exception e) {
      System.out.println("NOPE - ERROR");
    }
  }
}
