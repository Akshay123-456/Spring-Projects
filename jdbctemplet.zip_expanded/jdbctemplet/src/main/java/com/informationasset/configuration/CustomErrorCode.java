package com.informationasset.configuration;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;

public class CustomErrorCode extends SQLErrorCodeSQLExceptionTranslator{
protected DataAccessException customTranslate(SQLException exc)
{
	if(exc.getErrorCode()==23505)
	{
		return new DuplicateKeyException("Custom Exception translator - Integrity constraint violation.",exc);
	}
	return null;
}
}
