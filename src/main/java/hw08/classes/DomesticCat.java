package hw08.classes;

import java.util.Set;

public class DomesticCat extends Pet {
  DomesticCat() {
    super();
  }

  DomesticCat(String nickname) {
    super(nickname);
    species = Species.DOMESTICCAT;
  }

  DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
    super(nickname, age, trickLevel, habits);
    species = Species.DOMESTICCAT;
  }

  @Override
  public void respond() {
    System.out.printf("Myau Myau Myau :), i am %s\n", getNickname());
  }

  @Override
  public void foul() {
    System.out.println("Foul method in DomesticCat class");
  }
}