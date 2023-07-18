package com.indus.dp.singleton;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DBConnection {

	private static DBConnection conn = null;

	private DBConnection() {
		super();
		System.out.println(this);

	}

	public static DBConnection getConn() {

		if (conn == null) {
			conn = new DBConnection();
		}
		return conn;

	}
}