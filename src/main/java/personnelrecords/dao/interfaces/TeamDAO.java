package personnelrecords.dao.interfaces;

import personnelrecords.entity.Team;

public interface TeamDAO {
        Team create(Team team);
        boolean remove(Long id);
        void update(Long id, Team team);
        Team findById(Long id);
}
