/**
 * 
 */
package com.vanstone.centralserver.common.weixin.wrap.msg;

import org.dom4j.Document;
import org.dom4j.Element;

/**
 * 回复语音消息
	<xml>
		<ToUserName><![CDATA[toUser]]></ToUserName>
		<FromUserName><![CDATA[fromUser]]></FromUserName>
		<CreateTime>12345678</CreateTime>
		<MsgType><![CDATA[voice]]></MsgType>
		<Voice>
		<MediaId><![CDATA[media_id]]></MediaId>
		</Voice>
	</xml>
 * @author shipeng
 */
public class ReplyMsg4Voice extends AbstractMsg {
	private String mediaId;

	public ReplyMsg4Voice() {
		super(COMMON_TYPE_VOICE);
	}
	
	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
	public String toReplyXml() {
		Document document = this.toReplyDoc();
		Element xmlElement = document.getRootElement();
		
		Element voiceElement = xmlElement.addElement("Voice");
		Element mediaidElement = voiceElement.addElement("MediaId");
		mediaidElement.setText(this.getMediaId());
		
		return document.asXML();
	}
}
