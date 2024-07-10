import java.util.ArrayList;

public class ComicWorld<T> {
    private ArrayList<ArrayList<T>> comics;
    private ArrayList<T> heroes;
    private ArrayList<T> villains;
    private ArrayList<T> helpers;

    public ComicWorld() {
        comics = new ArrayList<>();
        heroes = new ArrayList<>();
        villains = new ArrayList<>();
        helpers = new ArrayList<>();
        comics.add(heroes);
        comics.add(villains);
        comics.add(helpers);
    }

    public void addHero(T hero) {
        heroes.add(hero);
    }

    public void addVillan(T villain) {
        villains.add(villain);
    }

    public void addHelper(T helper) {
        helpers.add(helper);
    }

    public void removeHero(T hero) {
        heroes.remove(hero);
    }

    public void removeVillan(T villain) {
        villains.remove(villain);
    }

    public void removeHelper(T helper) {
        helpers.remove(helper);
    }

    public void displayComics() {
        for (ArrayList<T> comic : comics) {
            for(T character : comic) {
                System.out.println(character);
            }
        }
    }
}
