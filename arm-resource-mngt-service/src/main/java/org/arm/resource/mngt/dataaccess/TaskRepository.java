package org.arm.resource.mngt.dataaccess;

import org.arm.resource.mngt.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
