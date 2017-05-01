import java.util.StringTokenizer;

/**
 * Created by Lenovo on 01/05/2017.
 */
public class RemoveStringSpace {
    public String removeSpace(String input){
        StringBuilder stringBuilder=new StringBuilder();
        StringTokenizer stringTokenizer=new StringTokenizer(input, " ");
        while (stringTokenizer.hasMoreElements()){
            stringBuilder.append(stringTokenizer.nextElement()).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
