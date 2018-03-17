package com.bank.mts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bank.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private Logger logger = Logger.getLogger("mts");

	private JdbcTemplate jdbcTemplate;

	public JdbcAccountRepository(DataSource dataSource) {
		logger.info("JdbcAccountRepository instantiated...");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Account loadAccount(String num) {
		logger.info("Loading account " + num);
		String sql = "select * from mts.ACCOUNTS where num=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Account>() {

			public Account mapRow(ResultSet rs, int r) throws SQLException {
				Account account = new Account();
				account.setNum(rs.getString(1));
				account.setBalance(rs.getDouble(2));
				account.setHolderName(rs.getString(3));
				return account;
			}

		}, num);
	}

	public boolean updateAccount(Account account) {
		logger.info("Updating account " + account.getNum());
		String sql = "update mts.ACCOUNTS set balance=? where num=?";
		jdbcTemplate.update(sql, account.getBalance(), account.getNum());
		return true;

	}
}
