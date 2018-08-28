package academy.learnprogramming.jokeserver;

import academy.learnprogramming.jokeserver.inernal.Filter;
import java.util.List;
import java.util.logging.*;

public class JokeServer {

  private List<String> jokes = List.of(
      "What do you call an old Snowman?\nWater",
      "Which dinosaur knew the most words?\nThe Thesaurus",
      "What is orange and sounds like a parrot?\nA carrot",
      "Why did the cow cross the road?\nIt wanted to go to the mooovies",
      "What did one wall say to the other wall?\nI'll meet you at the corner",
      "What has four wheels and flies?\nA garbage truck"
  );

  private int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }

  public int availableJokes() {
    return jokes.size();
  }

  public String getJokes() {
    int index = getRandomInteger(jokes.size(),0) ;
    return Filter.filterBadLanguage(jokes.get(index));
  }
  public String sname() {
    return "Kid Joke Server";
  }
}
