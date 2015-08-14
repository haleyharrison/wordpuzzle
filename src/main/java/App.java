import java.util.Arrays;
//import java.util.ArrayList;
import java.util.HashMap;
import static spark.Spark.*;
import spark.ModelAndView;
import java.util.Map;
import java.lang.*;
import java.io.Console;
import spark.template.velocity.VelocityTemplateEngine;



  public class wordProject {

    public static void main (String [] args) {
    Console console = System.console();
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/home.vtl");
        return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/detector.vtl");

        String userInput = request.queryParams("puzzle");
        String wordScore = getWordScore(userInputtedWord);
        model.put("wordScore", wordScore);
        model.put("word", userInputtedWord);
        return new ModelAndView(model, layout);
    },  new VelocityTemplateEngine());



    System.out.println("enter a sentence!");
    String stringUserInput = console.readLine();
    //String userInput = String.parseString(stringUserInput);

    System.out.println("here's your puzzle!");



    //breaks input into individual letters
    String[] userInput = word.split("");

    char [] c = str.toCharArray();

      for (int i = 0; i < str.length(); i++) {
      if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o'
                    || c[i] == 'u')  {
      System.out.println(str.replace(c[i], '?'));

            }
      return true;

        }

    }

}
