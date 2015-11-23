package observer.badcase;

import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class NewPostObserverImpl{

    private List<String> observerInternetPosts;
    private User user;

    public NewPostObserverImpl(User user) {
        this.observerInternetPosts = Internet.getInstance().getAllPosts();
        this.user = user;
    }

    public void observe() {
        while(true){
            List<String> currentInternetPosts = Internet.getInstance().getAllPosts();
            if(currentInternetPosts.size() > observerInternetPosts.size()){
                currentInternetPosts.removeAll(observerInternetPosts);
                sendToUser(currentInternetPosts);
                setObserverInternetPosts(Internet.getInstance().getAllPosts());
            }
        }

    }

    private void sendToUser(List<String> newestPosts) {
        user.addPostToFeed(newestPosts);
    }

    public void setObserverInternetPosts(List<String> newObserverInternetPosts) {
        this.observerInternetPosts = newObserverInternetPosts;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
