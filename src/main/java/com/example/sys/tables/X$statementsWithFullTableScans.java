/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables;


import com.example.sys.Sys;
import com.example.sys.tables.records.X$statementsWithFullTableScansRecord;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$statementsWithFullTableScans extends TableImpl<X$statementsWithFullTableScansRecord> {

	private static final long serialVersionUID = 2266001;

	/**
	 * The reference instance of <code>sys.x$statements_with_full_table_scans</code>
	 */
	public static final X$statementsWithFullTableScans X$STATEMENTS_WITH_FULL_TABLE_SCANS = new X$statementsWithFullTableScans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$statementsWithFullTableScansRecord> getRecordType() {
		return X$statementsWithFullTableScansRecord.class;
	}

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.query</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.db</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.exec_count</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, ULong> EXEC_COUNT = createField("exec_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.total_latency</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.no_index_used_count</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, ULong> NO_INDEX_USED_COUNT = createField("no_index_used_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.no_good_index_used_count</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, ULong> NO_GOOD_INDEX_USED_COUNT = createField("no_good_index_used_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.no_index_used_pct</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, BigInteger> NO_INDEX_USED_PCT = createField("no_index_used_pct", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(24).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.rows_sent</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.rows_examined</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.rows_sent_avg</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, BigInteger> ROWS_SENT_AVG = createField("rows_sent_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.rows_examined_avg</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, BigInteger> ROWS_EXAMINED_AVG = createField("rows_examined_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.first_seen</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, Timestamp> FIRST_SEEN = createField("first_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.last_seen</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, Timestamp> LAST_SEEN = createField("last_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$statements_with_full_table_scans.digest</code>.
	 */
	public final TableField<X$statementsWithFullTableScansRecord, String> DIGEST = createField("digest", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * Create a <code>sys.x$statements_with_full_table_scans</code> table reference
	 */
	public X$statementsWithFullTableScans() {
		this("x$statements_with_full_table_scans", null);
	}

	/**
	 * Create an aliased <code>sys.x$statements_with_full_table_scans</code> table reference
	 */
	public X$statementsWithFullTableScans(String alias) {
		this(alias, X$STATEMENTS_WITH_FULL_TABLE_SCANS);
	}

	private X$statementsWithFullTableScans(String alias, Table<X$statementsWithFullTableScansRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$statementsWithFullTableScans(String alias, Table<X$statementsWithFullTableScansRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$statementsWithFullTableScans as(String alias) {
		return new X$statementsWithFullTableScans(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$statementsWithFullTableScans rename(String name) {
		return new X$statementsWithFullTableScans(name, null);
	}
}