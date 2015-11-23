package observer.badcase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class Internet {
    public static Internet internet;
    private List<String> postList = new ArrayList<String>();

    private Internet(){
    }

    public static Internet getInstance() {
        if(internet == null){
            synchronized(Internet.class){
                if(internet == null){
                    return internet = new Internet();
                }
            }
        }
        return internet;
    }

    public void addNewPost(String post){
        postList.add(post);
    }

    public List<String> getAllPosts(){
        return Collections.synchronizedList(postList);
    }

}
