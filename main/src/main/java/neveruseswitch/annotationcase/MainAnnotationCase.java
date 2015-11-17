package neveruseswitch.annotationcase;

import neveruseswitch.DBUtil;
import neveruseswitch.annotationcase.message.MessageTemplateGenerator;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kanstantsin_Makarau on 12-Nov-15.
 */
public class MainAnnotationCase {

    private static Map<Integer, MessageTemplateGenerator> map = new HashMap<Integer, MessageTemplateGenerator>();

    public static void main(String[] args) throws Exception {
        int dbCode = DBUtil.getMailId();
        sendMessage(dbCode);
    }

    private static void sendMessage(int dbCode) throws Exception {
        Reflections reflection = new Reflections("neveruseswitch.annotationcase");  //path for ConfigurationBuilder
        Set<Class<? extends MessageTemplateGenerator>> implementationSet = reflection.getSubTypesOf(MessageTemplateGenerator.class);
        for(Class<? extends MessageTemplateGenerator> currentGenerator : implementationSet) {
            map.put(currentGenerator.getAnnotation(TemplateCode.class).value(), currentGenerator.newInstance());
        }
        MessageTemplateGenerator messageGenerator = map.get(dbCode);
        if(null == messageGenerator){
            throw new RuntimeException("Template message '"+dbCode+"' doesn't exist.");
        }
        sendMessage(messageGenerator.getBody());
    }

    private static void sendMessage(String html) {
        //50 lines of business code
        System.out.println(html);
    }

}
