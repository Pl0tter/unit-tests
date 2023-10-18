package seminar04.book;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * У вас есть класс BookService, который использует интерфейс BookRepository для получения информации
 * о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
 * используя Mockito для создания мок-объекта BookRepository.
 */
class BookServiceTest {
    @Mock
    static
    BookRepository bookRepositoryMock;
    static BookService bookService;

    @BeforeAll
    public static void setup() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    public void findBookById() {
        String id = "1";
        Book book = new Book(id, "Title", "Author");

        when(bookRepositoryMock.findById(id)).thenReturn(book);

        assert bookService.findBookById(id) == book : "Возвращена не та книга";

        verify(bookRepositoryMock).findById(id);
    }

    @Test
    public void findAllBooks() {
        List<Book> bookList = new ArrayList<>(Arrays.asList(new Book("1", "Title 1", "Author 2"),
                new Book("2", "Title 2", "Author 2"), new Book("3", "Title 3", "Author 3")));

        when(bookRepositoryMock.findAll()).thenReturn(bookList);

        assert bookService.findAllBooks() == bookList : "Возвращен не весь список";

        verify(bookRepositoryMock).findAll();
    }
}