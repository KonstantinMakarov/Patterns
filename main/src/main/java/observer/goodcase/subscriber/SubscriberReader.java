package observer.goodcase.subscriber;

import observer.goodcase.BlogPostEvent;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class SubscriberReader implements Subscriber {
    public void notify(BlogPostEvent event) {
        System.out.println("Content: " + event.getBlogPost().getContent());
    }
}
