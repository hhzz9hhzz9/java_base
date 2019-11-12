/**
 * 
 */
package com.woniu.ch14;

/**
 * 智能手机
 * 
 * @author Administrator
 *
 */
public class AptitudeHandset extends Handset implements Network, PlayWiring, TakePictures {
	public AptitudeHandset() {

	}

	/**
	 * @param brand
	 * @param type
	 */
	public AptitudeHandset(String brand, String type) {
		super(brand, type);

	}

	@Override
	public void play(String content) {
		// TODO 播放视频
		System.out.println("开始播放视频《" + content + "》......");

	}

	@Override
	public void networkConn() {
		// TODO 连网
		System.out.println("已经启动移动网络......");

	}

	@Override
	public void sendInfo() {
		// TODO 发送消息
		System.out.println("发送带图片与文字的信息......");

	}

	@Override
	public void call() {
		// TODO 视频通话
		System.out.println("开始视频通话......");

	}

	@Override
	public void takePicture() {
		// TODO 拍照
		System.out.println("咔嚓......拍照成功");

	}

}
