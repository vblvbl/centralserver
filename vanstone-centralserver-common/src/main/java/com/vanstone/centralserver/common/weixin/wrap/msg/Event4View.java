/**
 * 
 */
package com.vanstone.centralserver.common.weixin.wrap.msg;

/**
 * @author shipeng
 *
 */
public class Event4View extends AbstractEvent {
	private String eventKey;

	public Event4View() {
		super(RECEIVE_EVENT_VIEW);
	}
	
	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

}
