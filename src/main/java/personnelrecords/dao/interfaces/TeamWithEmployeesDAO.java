package personnelrecords.dao.interfaces;

import personnelrecords.entity.Team;
import java.util.List;

public interface TeamWithEmployeesDAO {

    List<Team> findAllTeams();
}
