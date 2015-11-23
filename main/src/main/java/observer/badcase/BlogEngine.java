package observer.badcase;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class BlogEngine {
    public void savePost(String post) {
        Internet.getInstance().addNewPost(post);
    }
}
