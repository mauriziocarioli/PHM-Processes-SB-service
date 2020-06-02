package com.health_insurance.service.listeners;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.kie.api.task.*;

@Component
public class PHMTaskLifeCycleEventListener implements TaskLifeCycleEventListener {
    //private static final Logger LOG = LogManager.getLogger(PHMProcessEventListener.class);
    private static final Logger LOG = LoggerFactory.getLogger(PHMProcessEventListener.class);

    /**
     * Constructor
     */
    public PHMTaskLifeCycleEventListener() {
        LOG.info("Registered PHMTaskLifeCycleEventListener.");
    }

    // ****************************/
    // ** TASK ACTIVATION EVENTS **/
    // ****************************/

    /**
     * @param event
     */
    public void beforeTaskActivatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be activated.");
    }

    /**
     * @param event
     */
    public void afterTaskActivatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been activated.");
    }

    // ****************************/
    // ** TASK ASSIGNMENT EVENTS **/
    // ****************************/

    /**
     * @param event
     */
    public void beforeTaskClaimedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be claimed.");
    }

    /**
     * @param event
     */
    public void afterTaskClaimedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has been claimed.");
    }

    /**
     * @param event
     */
    public void beforeTaskReleasedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be released.");
    }

    /**
     * @param event
     */
    public void afterTaskReleasedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been released.");
    }

    /**
     * @param event
     */
    public void beforeTaskReassignedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be reassigned.");
    }

    /**
     * @param event
     */
    public void afterTaskReassignedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been reassigned.");
    }

    /**
     * @param event
     */
    public void beforeTaskForwardedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be forwarded.");
    }

    /**
     * @param event
     */
    public void afterTaskForwardedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been forwarded.");
    }

    /**
     * @param event
     */
    public void beforeTaskDelegatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be delegated.");
    }

    /**
     * @param event
     */
    public void afterTaskDelegatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been delegated.");
    }

    /**
     * @param event
     */
    public void beforeTaskNominatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be nominated.");
    }

    /**
     * @param event
     */
    public void afterTaskNominatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been nominated.");
    }

    // ***************************/
    // ** TASK EXECUTION EVENTS **/
    // ***************************/

    /**
     * @param event
     */
    public void beforeTaskStartedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to start.");
    }

    /**
     * @param event
     */
    public void afterTaskStartedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has started.");
    }

    /**
     * @param event
     */
    public void beforeTaskCompletedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to complete.");
    }

    /**
     * @param event
     */
    public void afterTaskCompletedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has completed.");
    }

    /**
     * @param event
     */
    public void beforeTaskExitedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") is about to exit.");
    }

    /**
     * @param event
     */
    public void afterTaskExitedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has exited.");
    }

    /**
     * @param event
     */
    public void beforeTaskSuspendedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be suspended.");
    }

    /**
     * @param event
     */
    public void afterTaskSuspendedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been suspended.");
    }

    /**
     * @param event
     */
    public void beforeTaskResumedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to resume.");
    }

    /**
     * @param event
     */
    public void afterTaskResumedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has resumed.");
    }

    /**
     * @param event
     */
    public void beforeTaskStoppedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") is about stop.");
    }

    /**
     * @param event
     */
    public void afterTaskStoppedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has stopped.");
    }

    /**
     * @param event
     */
    public void beforeTaskSkippedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be skipped.");
    }

    /**
     * @param event
     */
    public void afterTaskSkippedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has been skipped.");
    }

    /**
     * @param event
     */
    public void beforeTaskFailedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") is about to fail.");
    }

    /**
     * @param event
     */
    public void afterTaskFailedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has failed.");
    }

    // *************************/
    // ** NOTIFICATION EVENTS **/
    // *************************/

    /**
     * @param event
     */
    public void beforeTaskNotificationEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be notified.");
    }

    /**
     * @param event
     */
    public void afterTaskNotificationEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been notified.");
    }

    // ********************/
    // ** EDITING EVENTS **/
    // ********************/

    /**
     * @param event
     */
    public void beforeTaskUpdatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be updated.");
    }

    /**
     * @param event
     */
    public void afterTaskUpdatedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has been updated.");
    }

    /**
     * @param event
     */
    public void beforeTaskAddedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be added.");
    }

    /**
     * @param event
     */
    public void afterTaskAddedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has been added.");
    }

}
