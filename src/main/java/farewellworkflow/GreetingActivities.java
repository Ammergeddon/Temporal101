package farewellworkflow;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface GreetingActivities {

    @ActivityMethod
    String greetInSpanish(String name);

    @ActivityMethod
    String farewellInSpanish(String name);
}
