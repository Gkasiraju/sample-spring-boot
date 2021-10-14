package springboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHello {

//@GetMapping("/hello")
//public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//return String.format("Hello %s!", name);
//}
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "                        Hello world!!";
	}
public static void main(String[] args) {
SpringApplication.run(SpringBootHello.class, args);
}
}
