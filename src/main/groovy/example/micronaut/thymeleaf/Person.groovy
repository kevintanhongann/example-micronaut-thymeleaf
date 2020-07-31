package example.micronaut.thymeleaf

import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@ToString
class Person {
  @Id
  @GeneratedValue
  Long id
  String name
  String email
  String address1
  String address2
  String city
  String state
  String country
}
