
/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Event fired when an incoming media begins and codec transcoding is either required or not.
 *
 **/
public class MediaTranscodingStateChangeEvent extends MediaEvent {

/**
 *
 * Current transcoding state; either enabled or disabled.
 *
 **/
	private org.kurento.client.MediaTranscodingState state;
/**
 *
 * Name of the GStreamer bin which is processing the media.
 *
 **/
	private String binName;
/**
 *
 * Type of media that is being processed; either audio or video.
 *
 **/
	private org.kurento.client.MediaType mediaType;

/**
 *
 * Event fired when an incoming media begins and codec transcoding is either required or not.
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
 * @param type
 *       Type of event that was raised
 * @param state
 *       Current transcoding state; either enabled or disabled.
 * @param binName
 *       Name of the GStreamer bin which is processing the media.
 * @param mediaType
 *       Type of media that is being processed; either audio or video.
 *
 **/
  public MediaTranscodingStateChangeEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("timestampMillis") String timestampMillis, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("state") org.kurento.client.MediaTranscodingState state, @org.kurento.client.internal.server.Param("binName") String binName, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType) {
    super(source, timestamp, timestampMillis, tags, type);
    this.state = state;
    this.binName = binName;
    this.mediaType = mediaType;
  }

/**
 *
 * Getter for the state property
 * @return Current transcoding state; either enabled or disabled. *
 **/
	public org.kurento.client.MediaTranscodingState getState() {
		return state;
	}

/**
 *
 * Setter for the state property
 *
 * @param state
 *       Current transcoding state; either enabled or disabled.
 *
 **/
	public void setState(org.kurento.client.MediaTranscodingState state) {
		this.state = state;
	}

/**
 *
 * Getter for the binName property
 * @return Name of the GStreamer bin which is processing the media. *
 **/
	public String getBinName() {
		return binName;
	}

/**
 *
 * Setter for the binName property
 *
 * @param binName
 *       Name of the GStreamer bin which is processing the media.
 *
 **/
	public void setBinName(String binName) {
		this.binName = binName;
	}

/**
 *
 * Getter for the mediaType property
 * @return Type of media that is being processed; either audio or video. *
 **/
	public org.kurento.client.MediaType getMediaType() {
		return mediaType;
	}

/**
 *
 * Setter for the mediaType property
 *
 * @param mediaType
 *       Type of media that is being processed; either audio or video.
 *
 **/
	public void setMediaType(org.kurento.client.MediaType mediaType) {
		this.mediaType = mediaType;
	}

}
