package observer.goodcase;

import observer.goodcase.subscriber.SubscriberAuthorBestFriend;
import observer.goodcase.subscriber.SubscriberAuthorFriend;
import observer.goodcase.subscriber.SubscriberReader;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class MainObserverGood {
    public static void main(String[] args){
        BlogEngine blogEngine = new BlogEngine();
        blogEngine.addSubscriber(new SubscriberAuthorFriend());
        blogEngine.addSubscriber(new SubscriberAuthorBestFriend());
        blogEngine.addSubscriber(new SubscriberReader());

        BlogPost blogPost = new BlogPost("Harry", "He is a wizard", 18);
        blogEngine.savePost(blogPost);
    }
}
