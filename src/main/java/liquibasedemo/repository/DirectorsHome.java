package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.DirectorMovie;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Directors.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.DirectorMovie
 */

public class DirectorsHome {

    private static final Log log = LogFactory.getLog(DirectorsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(DirectorMovie transientInstance) {
        log.debug("persisting Directors instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(DirectorMovie persistentInstance) {
        log.debug("removing Directors instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public DirectorMovie merge(DirectorMovie detachedInstance) {
        log.debug("merging Directors instance");
        try {
            DirectorMovie result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public DirectorMovie findById(Integer id) {
        log.debug("getting Directors instance with id: " + id);
        try {
            DirectorMovie instance = entityManager.find(DirectorMovie.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
