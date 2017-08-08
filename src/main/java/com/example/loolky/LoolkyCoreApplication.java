package com.example.loolky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoolkyCoreApplication {

	@Autowired
	UserRepository repo;

	@CrossOrigin
	//	@RequestMapping(value="/contractValidations", method= RequestMethod.GET, produces = APPLICATION_JSON_VALUE)

	@RequestMapping(value = "/userget", method = RequestMethod.GET)
	@ResponseBody
	public String get() {
		// ArrayList<Person> list = new ArrayList<>();
		// Person person = new Person();
		// Person person1= new Person();
		// Person person2= new Person();
		// person.setName("Dikla");
		// person.setAge(27);
		// person.setGender("Female");
		// list.add(person);
		//
		// person1.setName("Danny");
		// person1.setAge(40);
		// person1.setGender("Male");
		// list.add(person1);
		//
		//
		// list.add(person2);
		//
		// repo.save(list);

		// return list;
		return "Dikla";
	}

	@CrossOrigin
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public String post(@RequestBody UserBasic myFirstUser) {
		
		return "My First Person";
	}
	

//	@CrossOrigin
//	@RequestMapping(value = "/person", method = RequestMethod.DELETE)
//	@ResponseBody
//	public void delete(@RequestBody Person person) {
//		repo.delete(person);
//		// return person;
//	}

}
