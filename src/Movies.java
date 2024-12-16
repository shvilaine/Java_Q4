import java.util.Arrays;

public class Movies {
    public static void main(String[] args) {

        String[] movies = new String [] {
                "Raiders of the Lost Ark",
                "Indiana Jones and the Temple of Doom",
                "Indiana Jones and the Last Crusade"
        };

        String[][] actors = new String[][]{
                {"Harrison Ford", "Karen Allen", "Paul Freeman"},
                {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
                {"Harrison Ford", "Sean Connery", "Denholm Elliott"}
        };

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Dans le film " + movies[i] + ", les principaux acteurs sont: ");
            for (int j = 0; j < actors[i].length; j++) {
                System.out.println(actors[i][j]);
            }
        }
    }
}
