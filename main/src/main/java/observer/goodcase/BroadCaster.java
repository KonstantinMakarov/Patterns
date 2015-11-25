package observer.goodcase;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class BroadCaster {

    public void broadCastPost(BlogPost blogPost) {
        System.out.println("Post: " + blogPost.toString());
    }
}
