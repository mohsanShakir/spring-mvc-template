package com.springapp.reactor

import com.springapp.command.CreatePersonCommand
import com.springapp.domain.Person
import com.springapp.service.PersistanceService
import com.springapp.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import reactor.core.Reactor
import reactor.event.Event
import reactor.function.Consumer
import static reactor.event.selector.Selectors.$;

/**
 * Created by Mohsan on 30-06-2014.
 */
@Component
class Subscriber implements Consumer<Event<Object>> {

    @Autowired
    PersonService personService

    @Autowired
    public Subscriber(Reactor reactor)
    {
        reactor.on($('person.create'),this)

    }

    public void accept(Event<Object> ev) {
        CreatePersonCommand createPersonCommand = (CreatePersonCommand)ev.data
        personService.save(createPersonCommand.toPerson())
    }


}