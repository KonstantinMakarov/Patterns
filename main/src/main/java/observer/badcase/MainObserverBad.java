package observer.badcase;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class MainObserverBad {

    public static void main(String[] args) throws InterruptedException {
        Internet internet = Internet.getInstance();
        BlogEngine blogEngine = new BlogEngine();
        Thread thread = new Thread(){
            @Override
            public void run() {
                User user = new User();
                NewPostObserverImpl newPostObserver = new NewPostObserverImpl(user);
                newPostObserver.observe();
            }
        };
        thread.start();
        Thread.sleep(1000);
        blogEngine.savePost("Hello!");

        thread.stop();
    }

}
