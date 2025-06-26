package ch.axa.punchclock.repositories;

import java.util.List;

import ch.axa.punchclock.models.Entry;

public interface EntryRepositoryFilter {
    List<Entry> filter(Long categoryId, Long tagId, String descriptionSearch);
}