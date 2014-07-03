package com.springapp.reactor

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.Reactor
import reactor.event.Event;

/**
 * Created by Mohsan on 30-06-2014.
 */
@Service
public class Publisher {

    @Autowired
    Reactor reactor;


    public void publishPersonCreate(data) throws InterruptedException {

        reactor.notify("person.create", Event.wrap(data))
    }

}