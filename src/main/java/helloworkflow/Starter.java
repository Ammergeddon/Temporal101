package helloworkflow;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import io.temporal.client.WorkflowStub;
import io.temporal.serviceclient.WorkflowServiceStubs;

public class Starter {

    public static void main(String[] args) throws Exception {
        WorkflowServiceStubs service = WorkflowServiceStubs.newLocalServiceStubs();
        WorkflowClient client = WorkflowClient.newInstance(service);
        WorkflowOptions options = WorkflowOptions.newBuilder()
                .setWorkflowId("my-first-workflow")
                .setTaskQueue("greeting-tasks")
                .build();
        HelloWorkflowWorkflow workflow = client.newWorkflowStub(HelloWorkflowWorkflow.class, options);
        String greeting = workflow.greetSomeone(args[0]);
        String workflowId = WorkflowStub.fromTyped(workflow).getExecution().getWorkflowId();
        System.out.println(workflowId + " " + greeting);
    }

}
