package ch.axa.punchclock.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ch.axa.punchclock.models.Entry;

public interface EntryRepository extends CrudRepository<Entry, Long>, EntryRepositoryFilter {
    Iterable<Entry> findByCategory(@Param("categoryId") long categoryId);   

    Iterable<Entry> findByTagsId(Long tagId);

    @Query(value = "SELECT e FROM Entry e WHERE e.description LIKE %:descriptionSearch%")
    Iterable<Entry> searchByDescription(@Param("descriptionSearch") String descriptionSearch);
}