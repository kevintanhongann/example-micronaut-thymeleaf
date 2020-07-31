package example.micronaut.thymeleaf

import io.micronaut.context.event.ShutdownEvent
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.event.annotation.EventListener
import io.micronaut.discovery.event.ServiceReadyEvent

import javax.inject.Singleton

@Singleton
class Bootstrap {

  PersonRepository personRepository

  Bootstrap(PersonRepository personRepository) {
    this.personRepository = personRepository
  }

  @EventListener
  void onStartup(StartupEvent startupEvent) {
    personRepository.save(new Person(
      name: 'Kevin Tan',
      email: 'kevin@kevin.com',
      address1: 'address 1',
      address2: 'address 2',
      city: 'Petaling Jaya',
      state: 'Selangor',
      country: 'Malaysia'
    ))
  }

  @EventListener
  void onShutdownEvent(ShutdownEvent event) {
    // shutdown logic here
  }
}

