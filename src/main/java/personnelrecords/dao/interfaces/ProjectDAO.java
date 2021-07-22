package personnelrecords.dao.interfaces;

import personnelrecords.entity.Project;

public interface ProjectDAO {
    Project create(Project project);
    boolean remove(Long id);
    void update(Long id, Project project);
    Project findById(Long id);
}