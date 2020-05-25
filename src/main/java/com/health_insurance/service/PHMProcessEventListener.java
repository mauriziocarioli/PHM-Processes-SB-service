package com.health_insurance.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.kie.api.event.process.*;

@Component
public class PHMProcessEventListener extends DefaultProcessEventListener {
    private static final Logger LOG = LoggerFactory.getLogger(PHMProcessEventListener.class);

    /**
     * Constructor
      */
     public PHMProcessEventListener() {
         System.out.println("\n==========> PHMProcessEventListener created.\n");
         LOG.info("\n>>>>>>>>> PHMProcessEventListener created.\n");
    }

    /**
     * @param event
     */
    @Override
    public void beforeProcessStarted(ProcessStartedEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> is about to start.");
    }

    /**
     * @param event
     */
    @Override
    public void afterProcessStarted(ProcessStartedEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> has started.");
    }

    /**
     * @param event
     */
    @Override
    public void beforeProcessCompleted(ProcessCompletedEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> is about to complete.");
    }

    /**
     * @param event
     */
    @Override
    public void afterProcessCompleted(ProcessCompletedEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> has completed.");
    }

    /**
     * @param event
     */
    @Override
    public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Node <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> is about to be triggered.");
    }

    /**
     * @param event
     */
    @Override
    public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Node <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> has been triggered.");
    }

    /**
     * @param event
     */
    @Override
    public void beforeNodeLeft(ProcessNodeLeftEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Node <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> is about to be left.");
    }

    /**
     * @param event
     */
    @Override
    public void afterNodeLeft(ProcessNodeLeftEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Node <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId() + "> has been left.");
    }

    /**
     * @param event
     */
    @Override
    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Variable <<" + event.getVariableId() + ">>-<"
                + event.getVariableInstanceId() + "> is about to be changed from \n" + "<<" + event.getOldValue()
                + ">> \nto \n<<" + event.getNewValue() + ">>");
    }

    /**
     * @param event
     */
    @Override
    public void afterVariableChanged(ProcessVariableChangedEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Variable <<" + event.getVariableId() + ">>-<"
                + event.getVariableInstanceId() + "> has been changed from \n" + "<<" + event.getOldValue()
                + ">> \nto \n<<" + event.getNewValue() + ">>");
    }

    /**
     * @param event
     */
    @Override
    public void beforeSLAViolated(SLAViolatedEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->SLA <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> SLA is about to be violated.");
    }

    /**
     * @param event
     */
    @Override
    public void afterSLAViolated(SLAViolatedEvent event) {
        System.out.println("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->SLA <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> SLA has been violated.");
    }

}
