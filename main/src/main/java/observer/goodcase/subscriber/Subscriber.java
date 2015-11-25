package observer.goodcase.subscriber;

import observer.goodcase.BlogPostEvent;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public interface Subscriber {
    void notify(BlogPostEvent event);
}
