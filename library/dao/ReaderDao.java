package com.jnvc.library.dao;

import java.io.IOException;
import java.sql.ResultSet;

import com.jnvc.library.model.Person;
import com.jnvc.library.model.Reader;

public interface ReaderDao extends PersonDao{
	public boolean reg(Reader reader);  //Person???
	public ResultSet searchselect(String idno) throws IOException;
}
