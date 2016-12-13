/**
 * Created by me on 12/13/2016.
 */
public class AgeCategory {
    private int id;
    private String text;

    public AgeCategory(int id, String text){
        this.id=id;
        this.text=text;
    }

    public String toString(){
        return text;
    }

    public int getId(){
        return id;
    }
}
