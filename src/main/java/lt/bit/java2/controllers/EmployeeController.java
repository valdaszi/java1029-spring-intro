package lt.bit.java2.controllers;

import lt.bit.java2.entities.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @GetMapping("/{id}")
    Employee get(@PathVariable int id) {
        return new Employee(id, "Ona" + id);
    }

    @DeleteMapping("/{id}")
    Map<String, Object> delete(@PathVariable int id) {
        if (id > 10) {
            return Collections.singletonMap("success", true);
        } else {
            return Collections.singletonMap("success", false);
        }
    }
}
