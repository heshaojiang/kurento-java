
/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 *
 **/
public class RaiseBaseEvent implements Event {

/**
 *
 * Object that raised the event
 *
 **/
	private org.kurento.client.MediaObject source;
/**
 *
 * @deprecated
 * [DEPRECATED: Use timestampMillis] The timestamp associated with this object: Seconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
 *
 **/
	private String timestamp;
/**
 *
 * The timestamp associated with this event: Milliseconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
 *
 **/
	private String timestampMillis;
/**
 *
 *
 **/
	private java.util.List<org.kurento.client.Tag> tags;

/**
 *
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       @deprecated
 *       [DEPRECATED: Use timestampMillis] The timestamp associated with this object: Seconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
 * @param timestampMillis
 *       The timestamp associated with this event: Milliseconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
 * @param tags
 *       
 *
 **/
  public RaiseBaseEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("timestampMillis") String timestampMillis, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags) {
    super();
    this.source = source;
    this.timestamp = timestamp;
    this.timestampMillis = timestampMillis;
    this.tags = tags;
  }

/**
 *
 * Getter for the source property
 * @return Object that raised the event *
 **/
	public org.kurento.client.MediaObject getSource() {
		return source;
	}

/**
 *
 * Setter for the source property
 *
 * @param source
 *       Object that raised the event
 *
 **/
	public void setSource(org.kurento.client.MediaObject source) {
		this.source = source;
	}

/**
 *
 * Getter for the timestamp property
 * @return @deprecated
[DEPRECATED: Use timestampMillis] The timestamp associated with this object: Seconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC). *
 **/
	public String getTimestamp() {
		return timestamp;
	}

/**
 *
 * Setter for the timestamp property
 *
 * @param timestamp
 *       @deprecated
 *       [DEPRECATED: Use timestampMillis] The timestamp associated with this object: Seconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
 *
 **/
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

/**
 *
 * Getter for the timestampMillis property
 * @return The timestamp associated with this event: Milliseconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC). *
 **/
	public String getTimestampMillis() {
		return timestampMillis;
	}

/**
 *
 * Setter for the timestampMillis property
 *
 * @param timestampMillis
 *       The timestamp associated with this event: Milliseconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
 *
 **/
	public void setTimestampMillis(String timestampMillis) {
		this.timestampMillis = timestampMillis;
	}

/**
 *
 * Getter for the tags property
 * @return  *
 **/
	public java.util.List<org.kurento.client.Tag> getTags() {
		return tags;
	}

/**
 *
 * Setter for the tags property
 *
 * @param tags
 *       
 *
 **/
	public void setTags(java.util.List<org.kurento.client.Tag> tags) {
		this.tags = tags;
	}

}
