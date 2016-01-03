/**
 * This class is generated by jOOQ
 */
package com.example.information_schema.tables;


import com.example.information_schema.InformationSchema;
import com.example.information_schema.tables.records.InnodbBufferPageLruRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class InnodbBufferPageLru extends TableImpl<InnodbBufferPageLruRecord> {

	private static final long serialVersionUID = -1901029342;

	/**
	 * The reference instance of <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>
	 */
	public static final InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = new InnodbBufferPageLru();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbBufferPageLruRecord> getRecordType() {
		return InnodbBufferPageLruRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> POOL_ID = createField("POOL_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> LRU_POSITION = createField("LRU_POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> PAGE_NUMBER = createField("PAGE_NUMBER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, String> PAGE_TYPE = createField("PAGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> FLUSH_TYPE = createField("FLUSH_TYPE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> FIX_COUNT = createField("FIX_COUNT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, String> IS_HASHED = createField("IS_HASHED", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> NEWEST_MODIFICATION = createField("NEWEST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> OLDEST_MODIFICATION = createField("OLDEST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> ACCESS_TIME = createField("ACCESS_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> NUMBER_RECORDS = createField("NUMBER_RECORDS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> DATA_SIZE = createField("DATA_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> COMPRESSED_SIZE = createField("COMPRESSED_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, String> COMPRESSED = createField("COMPRESSED", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, String> IO_FIX = createField("IO_FIX", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, String> IS_OLD = createField("IS_OLD", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
	 */
	public final TableField<InnodbBufferPageLruRecord, ULong> FREE_PAGE_CLOCK = createField("FREE_PAGE_CLOCK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_BUFFER_PAGE_LRU</code> table reference
	 */
	public InnodbBufferPageLru() {
		this("INNODB_BUFFER_PAGE_LRU", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE_LRU</code> table reference
	 */
	public InnodbBufferPageLru(String alias) {
		this(alias, INNODB_BUFFER_PAGE_LRU);
	}

	private InnodbBufferPageLru(String alias, Table<InnodbBufferPageLruRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbBufferPageLru(String alias, Table<InnodbBufferPageLruRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLru as(String alias) {
		return new InnodbBufferPageLru(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbBufferPageLru rename(String name) {
		return new InnodbBufferPageLru(name, null);
	}
}
