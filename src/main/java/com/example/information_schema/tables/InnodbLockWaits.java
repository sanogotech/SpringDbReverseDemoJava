/**
 * This class is generated by jOOQ
 */
package com.example.information_schema.tables;


import com.example.information_schema.InformationSchema;
import com.example.information_schema.tables.records.InnodbLockWaitsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbLockWaits extends TableImpl<InnodbLockWaitsRecord> {

	private static final long serialVersionUID = 1810863234;

	/**
	 * The reference instance of <code>information_schema.INNODB_LOCK_WAITS</code>
	 */
	public static final InnodbLockWaits INNODB_LOCK_WAITS = new InnodbLockWaits();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbLockWaitsRecord> getRecordType() {
		return InnodbLockWaitsRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_LOCK_WAITS.requesting_trx_id</code>.
	 */
	public final TableField<InnodbLockWaitsRecord, String> REQUESTING_TRX_ID = createField("requesting_trx_id", org.jooq.impl.SQLDataType.VARCHAR.length(18).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_LOCK_WAITS.requested_lock_id</code>.
	 */
	public final TableField<InnodbLockWaitsRecord, String> REQUESTED_LOCK_ID = createField("requested_lock_id", org.jooq.impl.SQLDataType.VARCHAR.length(81).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_LOCK_WAITS.blocking_trx_id</code>.
	 */
	public final TableField<InnodbLockWaitsRecord, String> BLOCKING_TRX_ID = createField("blocking_trx_id", org.jooq.impl.SQLDataType.VARCHAR.length(18).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_LOCK_WAITS.blocking_lock_id</code>.
	 */
	public final TableField<InnodbLockWaitsRecord, String> BLOCKING_LOCK_ID = createField("blocking_lock_id", org.jooq.impl.SQLDataType.VARCHAR.length(81).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_LOCK_WAITS</code> table reference
	 */
	public InnodbLockWaits() {
		this("INNODB_LOCK_WAITS", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_LOCK_WAITS</code> table reference
	 */
	public InnodbLockWaits(String alias) {
		this(alias, INNODB_LOCK_WAITS);
	}

	private InnodbLockWaits(String alias, Table<InnodbLockWaitsRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbLockWaits(String alias, Table<InnodbLockWaitsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLockWaits as(String alias) {
		return new InnodbLockWaits(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbLockWaits rename(String name) {
		return new InnodbLockWaits(name, null);
	}
}
