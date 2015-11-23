package observer.badcase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class User {
    private List<String> feed = new ArrayList<String>();

    public void addPostToFeed(List<String> newestPosts) {
        feed.addAll(newestPosts);
        System.out.println("New Feed");
    }

    @Override
    public String toString() {
        return "User{" +
                "feed=" + feed +
                '}';
    }

}
