package temlatemethod.badcase.step;

/**
 * Created by Kanstantsin_Makarau on 25-Nov-15.
 */
public enum EnumStep {
    BUILD_BODY(1, new StepBuildBody()),
    ADD_SUBJECT(2, new StepAddSubject()),
    ADD_FROM(3, new StepAddFrom()),
    ADD_TO(4, new StepAddTo()),
    VALIDATION(5, new StepValidation()),
    SEND_MAIL(6, new SendMail());

    private int stepNumber;
    private Step step;

    EnumStep(int stepNumber, Step step){
        this.step = step;
        this.stepNumber = stepNumber;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public Step getStep() {
        return step;
    }
}
