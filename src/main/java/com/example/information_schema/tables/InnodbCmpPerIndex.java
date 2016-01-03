/**
 * This class is generated by jOOQ
 */
package com.example.information_schema.tables;


import com.example.information_schema.InformationSchema;
import com.example.information_schema.tables.records.InnodbCmpPerIndexRecord;

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
public class InnodbCmpPerIndex extends TableImpl<InnodbCmpPerIndexRecord> {

	private static final long serialVersionUID = 1545769085;

	/**
	 * The reference instance of <code>information_schema.INNODB_CMP_PER_INDEX</code>
	 */
	public static final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = new InnodbCmpPerIndex();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbCmpPerIndexRecord> getRecordType() {
		return InnodbCmpPerIndexRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_CMP_PER_INDEX.database_name</code>.
	 */
	public final TableField<InnodbCmpPerIndexRecord, String> DATABASE_NAME = createField("database_name", org.jooq.impl.SQLDataType.VARCHAR.length(192).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_PER_INDEX.table_name</code>.
	 */
	public final TableField<InnodbCmpPerIndexRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(192).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_PER_INDEX.index_name</code>.
	 */
	public final TableField<InnodbCmpPerIndexRecord, String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.VARCHAR.length(192).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops</code>.
	 */
	public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_OPS = createField("compress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops_ok</code>.
	 */
	public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_OPS_OK = createField("compress_ops_ok", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_PER_INDEX.compress_time</code>.
	 */
	public final TableField<InnodbCmpPerIndexRecord, Integer> COMPRESS_TIME = createField("compress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_ops</code>.
	 */
	public final TableField<InnodbCmpPerIndexRecord, Integer> UNCOMPRESS_OPS = createField("uncompress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_time</code>.
	 */
	public final TableField<InnodbCmpPerIndexRecord, Integer> UNCOMPRESS_TIME = createField("uncompress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_CMP_PER_INDEX</code> table reference
	 */
	public InnodbCmpPerIndex() {
		this("INNODB_CMP_PER_INDEX", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX</code> table reference
	 */
	public InnodbCmpPerIndex(String alias) {
		this(alias, INNODB_CMP_PER_INDEX);
	}

	private InnodbCmpPerIndex(String alias, Table<InnodbCmpPerIndexRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbCmpPerIndex(String alias, Table<InnodbCmpPerIndexRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndex as(String alias) {
		return new InnodbCmpPerIndex(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbCmpPerIndex rename(String name) {
		return new InnodbCmpPerIndex(name, null);
	}
}
