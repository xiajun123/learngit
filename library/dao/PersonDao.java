package com.jnvc.library.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.jnvc.library.model.Person;

public interface PersonDao {
		public abstract Person log(Person person, String type) throws IOException;
		
		public abstract boolean borrowbook(String callnumber,String idno);
		public abstract boolean returnbook(String bookno,String retrncheck) throws SQLException;
}
