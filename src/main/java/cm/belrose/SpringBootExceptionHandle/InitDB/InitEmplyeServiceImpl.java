package cm.belrose.SpringBootExceptionHandle.InitDB;

import cm.belrose.SpringBootExceptionHandle.dao.EmployeDao;
import cm.belrose.SpringBootExceptionHandle.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

@Service
@Transactional
public class InitEmplyeServiceImpl implements InitEmployeServie {
    @Autowired
    private EmployeDao employeDao;
    @Override
    public void initEmploye() {
        Stream.of("Employe 1","Employe 2","Employe 3","Employe 4","Employe 3").forEach(nameEmploye->{
            Employe employe=new Employe();
            employe.setDesignation("Designation "+nameEmploye);
            employe.setName("nom "+nameEmploye);
            employe.setSalary(200000+Math.random()*10);
            employeDao.save(employe);
        });

    }
}
