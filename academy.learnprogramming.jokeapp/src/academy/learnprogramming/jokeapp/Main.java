package academy.learnprogramming.jokeapp;


import academy.learnprogramming.jokeserver.JokeServer;

public class Main {

  public static void main(String args[]){
    final int NUM_JOKES = 20;
    JokeServer s = new JokeServer();
    System.out.printf("Displaying %d Random jokes from %s\n", NUM_JOKES ,s.sname());
    for (int i= 0; i<NUM_JOKES ; i++){
      System.out.println(s.getJokes() +"\n");
    }

  }

}
