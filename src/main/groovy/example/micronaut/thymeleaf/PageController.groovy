package example.micronaut.thymeleaf

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.ModelAndView
import io.micronaut.views.View;

@Controller
class PageController {

  private final PersonRepository personRepository

  PageController(PersonRepository personRepository) {
    this.personRepository = personRepository
  }

  @Get("/")
  ModelAndView index(){
    //todo might return user
    new ModelAndView('index', null)
  }

  @Get("/person")
  @View("person/index")
  Map<String, Object> personIndex(){
    //todo returns person list
    List<Person> personList = personRepository.findAll()
    println 'personList '+personList
    Map<String, Object> map = new HashMap<>()
    map.put('personList', personList)
    return map
  }


}
