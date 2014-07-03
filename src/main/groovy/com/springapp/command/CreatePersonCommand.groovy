package com.springapp.command

import com.springapp.domain.Person

/**
 * Created by Mohsan on 03-07-2014.
 */
class CreatePersonCommand {

    String name
    int age

    Person toPerson(){
        new Person(name: this.name,age: this.age)
    }
}
