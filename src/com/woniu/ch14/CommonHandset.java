/**
 * 
 */
package com.woniu.ch14;

/**普通手机
 * @author Administrator
 *
 */
public class CommonHandset extends Handset implements PlayWiring {
	public CommonHandset(){
		
	}
	

	/**
	 * @param brand
	 * @param type
	 */
	public CommonHandset(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void play(String content) {
		// TODO 放音乐
		System.out.println("开始播放音乐《"+content+"》......");

	}

	@Override
	public void sendInfo() {
		// TODO 发消息
		System.out.println("发送文字信息......");

	}

	@Override
	public void call() {
		// TODO 打电话
		System.out.println("开始语音通话.....");

	}

}
