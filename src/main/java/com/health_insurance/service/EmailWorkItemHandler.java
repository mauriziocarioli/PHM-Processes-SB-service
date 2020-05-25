package com.health_insurance.service;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailAuthenticationException;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;
import org.kie.api.runtime.process.WorkItemHandler;

@Component("Email")
public class EmailWorkItemHandler implements WorkItemHandler {

    @Autowired
    private JavaMailSender javaMailSender;

    public EmailWorkItemHandler() {
        System.out.println("\n>>>>>>> EmailWorkItemHandler created <<<<<<<<\n");
    }

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        System.out.println(">>>>>>> Executing Email Work Item with id '" + workItem.getId() +
                "' on process instance: " + workItem.getProcessInstanceId());

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo((String)workItem.getParameter("To"));
        msg.setFrom((String)workItem.getParameter("From"));
        msg.setSubject((String)workItem.getParameter("Subject"));
        msg.setText((String)workItem.getParameter("Body"));
        try {
            javaMailSender.send(msg);
        } catch (MailAuthenticationException ex) {
            System.out.println("ERROR authenticating to server in EmailWorkItemHandler: "+ex.getStackTrace());
        } catch (MailSendException ex) {
            System.out.println("ERROR sending messagein EmailWorkItemHandler: "+ex.getStackTrace());
        } catch (MailException ex) {
            System.out.println("ERROR in EmailWorkItemHandler: "+ex.getStackTrace());
        }

        Map<String, Object> results = new HashMap<>();
        workItemManager.completeWorkItem(workItem.getId(), results);
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
    }

}
