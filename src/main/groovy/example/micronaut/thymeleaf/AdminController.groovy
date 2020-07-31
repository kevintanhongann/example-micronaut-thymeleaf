package example.micronaut.thymeleaf

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.ModelAndView
import io.micronaut.views.View

@Controller("/admin")
class AdminController {

  PersonRepository personRepository

  AdminController(PersonRepository personRepository) {
    this.personRepository = personRepository
  }

  @Get("/person")
  @View("person/index")
  Map<String, Object> personIndex(){
    Map<String, Object> map = new HashMap<>()

  }

  @Get("/person/{id}")
  @View("admin/person/show")
  Map<String, Object> personShow(Long id){
    Map<String, Object> map = new HashMap<>()

  }

  @Get("/person/{id}/edit")
  @View("admin/person/edit")
  Map<String, Object> personEdit(Long id){
    Map<String, Object> map = new HashMap<>()

  }

  @Get("/person/create")
  @View("admin/person/create")
  Map<String, Object> personCreate(){
    Map<String, Object> map = new HashMap<>()

  }

}
