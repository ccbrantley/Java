import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class DataStore {

    // Static Attribute
    private static DataStore singleton = null;
    // private constructor
    private DataStore() {}
    // Private attribute store section array
    private static Section[] sections = new Section[15];
    private static File sectionFile = Paths.get(".", "resources", "Sections.txt").normalize().toFile();

    public static DataStore getInstance(){
        if (singleton == null){
            singleton = new DataStore();
            try {
                Scanner f = new Scanner(sectionFile);
                for (int i = 0; i < sections.length;i++) {
                    sections[i] = new Section(f.next(), f.next(), f.next(), f.next(),f.next(), f.next(), f.next(), f.next());
                }}
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return singleton;
    }

    public static Section[] getSections() { return sections; }
}
