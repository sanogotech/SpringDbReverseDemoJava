/**
 * This class is generated by jOOQ
 */
package com.example.performance_schema.tables;


import com.example.performance_schema.PerformanceSchema;
import com.example.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord;

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
public class EventsStagesSummaryByThreadByEventName extends TableImpl<EventsStagesSummaryByThreadByEventNameRecord> {

	private static final long serialVersionUID = 113912535;

	/**
	 * The reference instance of <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>
	 */
	public static final EventsStagesSummaryByThreadByEventName EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME = new EventsStagesSummaryByThreadByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsStagesSummaryByThreadByEventNameRecord> getRecordType() {
		return EventsStagesSummaryByThreadByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.THREAD_ID</code>.
	 */
	public final TableField<EventsStagesSummaryByThreadByEventNameRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.EVENT_NAME</code>.
	 */
	public final TableField<EventsStagesSummaryByThreadByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.COUNT_STAR</code>.
	 */
	public final TableField<EventsStagesSummaryByThreadByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesSummaryByThreadByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesSummaryByThreadByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesSummaryByThreadByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesSummaryByThreadByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_stages_summary_by_thread_by_event_name</code> table reference
	 */
	public EventsStagesSummaryByThreadByEventName() {
		this("events_stages_summary_by_thread_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_stages_summary_by_thread_by_event_name</code> table reference
	 */
	public EventsStagesSummaryByThreadByEventName(String alias) {
		this(alias, EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME);
	}

	private EventsStagesSummaryByThreadByEventName(String alias, Table<EventsStagesSummaryByThreadByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsStagesSummaryByThreadByEventName(String alias, Table<EventsStagesSummaryByThreadByEventNameRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByThreadByEventName as(String alias) {
		return new EventsStagesSummaryByThreadByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EventsStagesSummaryByThreadByEventName rename(String name) {
		return new EventsStagesSummaryByThreadByEventName(name, null);
	}
}