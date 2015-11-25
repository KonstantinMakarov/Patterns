package observer.goodcase;

import observer.goodcase.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class BlogEngine {
    List<Subscriber> subscribers = new ArrayList<Subscriber>();
    BroadCaster broadCuster = new BroadCaster();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void savePost(BlogPost blogPost){
        broadCuster.broadCastPost(blogPost);
        for(Subscriber subscriber: subscribers){
            subscriber.notify(new BlogPostEvent(blogPost));
        }
    }
}
