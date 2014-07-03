package com.springapp.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


/**
 * Created with IntelliJ IDEA.
 * User: Mohsan
 * Date: 09-03-14
 * Time: 01:19
 * To change this template use File | Settings | File Templates.
 */
@Entity
class Person implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String name

    @Column
    int age

}
