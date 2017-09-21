package priv

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
@EnableConfigServer
class Application


object Application extends App{

  val context: ConfigurableApplicationContext = new SpringApplicationBuilder(classOf[Application]).run(args: _*)

}
