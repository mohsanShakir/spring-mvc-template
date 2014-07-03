package com.springapp.controller

import com.springapp.command.CreatePersonCommand
import com.springapp.domain.Person
import com.springapp.reactor.Publisher
import com.springapp.service.PersistanceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created with IntelliJ IDEA.
 * User: Mohsan
 * Date: 09-03-14
 * Time: 01:19
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PersonController {

    @Autowired
    private PersistanceService persistanceService

    @Autowired
    private Publisher publisher

    @RequestMapping(value = '/person', method = RequestMethod.POST)
    public String greetingPost(
            @ModelAttribute("createPersonCommand") CreatePersonCommand createPersonCommand, BindingResult result) {

        publisher.publishPersonCreate(createPersonCommand)

        return 'redirect:/person'
    }

    @RequestMapping(value = '/person', method = RequestMethod.GET)
    public String greetingGet(Model model) {
        model.addAttribute("persons", persistanceService.list(Person.class))
        model.addAttribute("createPersonCommand", new CreatePersonCommand())
        return '/person'
    }


}