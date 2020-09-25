package com.galaxy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author Felix Rafael Moreno
 * @version V1.0
 * */
@Entity
public class VisitorLogs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "visitor_log_id")
	private long visitorLogId;
	
	@Column(name = "from_id")
	private long fromId;
	
	@Column(name = "to_id")
	private long toId;
	
	@Column(name = "visit_date")
	private String visitDate;
	
	@Column(name = "visit_type")
	private String visitType;
	
	public VisitorLogs() {
		
	}

	public VisitorLogs(long fromId, long toId, String visitDate, String visitType) {
		super();
		this.fromId = fromId;
		this.toId = toId;
		this.visitDate = visitDate;
		this.visitType = visitType;
	}

	public long getVisitorLogId() {
		return visitorLogId;
	}

	public void setVisitorLogId(long visitorLogId) {
		this.visitorLogId = visitorLogId;
	}

	public long getFromId() {
		return fromId;
	}

	public void setFromId(long fromId) {
		this.fromId = fromId;
	}

	public long getToId() {
		return toId;
	}

	public void setToId(long toId) {
		this.toId = toId;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	public String getVisitType() {
		return visitType;
	}

	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}

	@Override
	public String toString() {
		return "VisitorLogs [visitorLogId=" + visitorLogId + ", fromId=" + fromId + ", toId=" + toId + ", visitDate="
				+ visitDate + ", visitType=" + visitType + "]";
	}
}
