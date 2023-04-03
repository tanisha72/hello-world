/**
 * 
 */
package com.demo.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanisha gupta
 *
 */

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world/{firstName}")
	public ResponseEntity<String> sayHello(@PathVariable String firstName) {
		return ResponseEntity.status(HttpStatus.OK).body("Hello " + firstName);
	}

}
