package com.jnvc.library.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import com.jnvc.library.model.Book;

public interface BookDao {
	public abstract boolean add(Book book) throws Exception;
	public abstract boolean delete(String bookno) throws SQLException, FileNotFoundException;
	public abstract boolean update(Book book) throws SQLException, FileNotFoundException;
	public abstract List <Book> search() throws FileNotFoundException, Exception;

	public abstract List <Book> search(String value,String...type) throws FileNotFoundException,Exception;
	public abstract List<Book> searchByEditor(String editor);
	public abstract List<Book> searchByTitle(String title);
	public abstract List<Book> searchByType(String category);
	
	public abstract int bookcount(String callnumber) throws IOException;
	public abstract int bookleft(String callnumber) throws IOException;
}
