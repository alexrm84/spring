package alexrm84.hibernate.dao;

import alexrm84.hibernate.model.Project;

public class ProjectDAO extends AbstractDAO {

    public Project find(final String id) {
        return entityManager.find(Project.class, id);
    }

    public Project getById(final String id) {
        if (id == null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM Project e WHERE e.id = :id", Project.class).setParameter("id", id).setMaxResults(1));
    }
}
