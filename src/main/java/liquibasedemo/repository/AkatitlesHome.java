package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Akatitles;
import liquibasedemo.data.AkatitlesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Akatitles.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Akatitles
 */

public class AkatitlesHome {

    private static final Log log = LogFactory.getLog(AkatitlesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Akatitles transientInstance) {
        log.debug("persisting Akatitles instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Akatitles persistentInstance) {
        log.debug("removing Akatitles instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Akatitles merge(Akatitles detachedInstance) {
        log.debug("merging Akatitles instance");
        try {
            Akatitles result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Akatitles findById(AkatitlesId id) {
        log.debug("getting Akatitles instance with id: " + id);
        try {
            Akatitles instance = entityManager.find(Akatitles.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
