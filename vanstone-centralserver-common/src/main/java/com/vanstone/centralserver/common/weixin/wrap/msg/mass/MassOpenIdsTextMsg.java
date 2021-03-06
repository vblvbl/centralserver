/**
 * 
 */
package com.vanstone.centralserver.common.weixin.wrap.msg.mass;

import java.util.LinkedHashMap;
import java.util.Map;

import com.vanstone.centralserver.common.JsonUtil;

/**
 * 大规模Text消息定义
 * @author shipeng
 *
 */
public class MassOpenIdsTextMsg extends AbstractOpenIdsMassMsg {
	
	public MassOpenIdsTextMsg() {
		super(TEXT_TYPE);
	}
	
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/* (non-Javadoc)
	 * @see com.vanstone.centralserver.common.weixin.wrap.msg.mass.AbstractMassMsg#toJson()
	 */
	@Override
	public String toJson() {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		
		map.put("touser", this.getOpenIds());
		
		Map<String, Object> textMap = new LinkedHashMap<String, Object>();
		textMap.put("content", this.getContent());
		map.put("text", textMap);
		
		map.put("msgtype", this.getMsgtype());
		
		return JsonUtil.object2PrettyString(map, false);
	}
}
