package ch.axa.punchclock.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ch.axa.punchclock.models.Entry;

public interface EntryRepository extends CrudRepository<Entry, Long> {
    Iterable<Entry> findByCategory(@Param("categoryId") long categoryId);
}