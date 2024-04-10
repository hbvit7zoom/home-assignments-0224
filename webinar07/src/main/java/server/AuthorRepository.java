package server;

import java.util.HashMap;
import java.util.Map;

public class AuthorRepository {

    private Map<Long, Author> authorMap = new HashMap<>();

    public Author save(Author author) {
        Long id = authorMap.size() + 1L;

        author.setId(id);

        authorMap.put(id, author);

        return author;
    }
}
