package cm.belrose.SpringBootExceptionHandle.dao;

import cm.belrose.SpringBootExceptionHandle.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao extends JpaRepository<Employe,Long> {
}
