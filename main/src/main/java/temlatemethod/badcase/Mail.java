package temlatemethod.badcase;

import temlatemethod.badcase.step.Step;
import temlatemethod.badcase.step.EnumStep;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public class Mail {
    private final String body;
    private final String subject;
    private final String fromAddress;
    private final String toAddress;

    private Mail(String body, String subject, String fromAddress, String toAddress) {
        this.body = body;
        this.subject = subject;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
    }

    public static class Builder {
        private String body;
        private String subject;
        private String fromAddress;
        private String toAddress;

        public Builder(){

        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder fromAddress(String fromAddress) {
            this.fromAddress = fromAddress;
            return this;
        }

        public Builder toAddress(String toAddress) {
            this.toAddress = toAddress;
            return this;
        }

        public Mail build() {
            int currentStepNumber = 1;
            Mail mail = new Mail(body, subject, fromAddress, toAddress);
            for(EnumStep tempStep : EnumStep.values()){
                if(tempStep.getStepNumber() == currentStepNumber){
                    Step step = tempStep.getStep();
                    step.execute(mail);
                    currentStepNumber++;
                }
            }
            return null;
        }
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                ", fromAddress='" + fromAddress + '\'' +
                ", toAddress='" + toAddress + '\'' +
                '}';
    }
}
