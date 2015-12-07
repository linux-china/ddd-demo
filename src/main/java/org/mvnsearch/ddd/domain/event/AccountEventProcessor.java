package org.mvnsearch.ddd.domain.event;

import org.mvnsearch.ddd.domain.annotations.DomainEventProcessor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * account event processor
 *
 * @author linux_china
 */
@Component
@DomainEventProcessor
public class AccountEventProcessor {

    @EventListener(condition = "#loginEvent.success")
    //@Async
    public void processLoginSuccess(LoginEvent loginEvent) {
        System.out.println("User login: " + loginEvent.getNick());
    }

    @EventListener(condition = "#loginEvent.success == false")
    //@Async
    public void processLoginFailed(LoginEvent loginEvent) {
        System.out.println("User login failed: " + loginEvent.getNick());
    }
}
