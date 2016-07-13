package com.jnvc.library.dao;

import java.util.List;

import com.jnvc.library.model.Reader;

public interface AdminDao extends PersonDao {
	
	public List<Reader>search(int privilege);
	public boolean check(String idno);
	public boolean borrowbookcheck(String bookno,String idno,String borrowcheck);
	
}
