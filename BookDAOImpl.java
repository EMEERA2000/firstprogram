
import java.sql.Connection;
import java.util.List;

public interface BookDAOImpl {
	public static final String jdbcurl="jdbc:mysql://localhost:3306/mark";
	public static final String driverclass="com.mysql.cj.jdbc.Driver";
	public static final String username="Meera";
	public static final String password="Meera";
	Connection getConnection();
	void insertBooks(Book b);
	Book selectBook(int id);
	List<Book> selectAllBook();
	boolean deleteBook(int id);
	boolean updateStudent(Book b);
}
