package example.micronaut.thymeleaf

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface PersonRepository extends CrudRepository<Person, Long> {
  Person findByName(String name)
}
