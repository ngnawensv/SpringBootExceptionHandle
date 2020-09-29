package cm.belrose.SpringBootExceptionHandle.Controllers;

import cm.belrose.SpringBootExceptionHandle.entities.Employe;
import cm.belrose.SpringBootExceptionHandle.exception.EmployeServiceException;
import cm.belrose.SpringBootExceptionHandle.exception.ResourceNotFoundException;
import cm.belrose.SpringBootExceptionHandle.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeService employeService;

    @GetMapping(value = "/employe/{id}")
    public ResponseEntity<Employe> findEmployeById(@PathVariable("id") Long id) throws ResourceNotFoundException, EmployeServiceException {
        Optional<Employe> employeFound = employeService.findEmplyeById(id);
        return new ResponseEntity<>(employeFound.get(), HttpStatus.FOUND);

    }

}
